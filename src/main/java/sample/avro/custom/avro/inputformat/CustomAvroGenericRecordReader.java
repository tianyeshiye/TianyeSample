package sample.avro.custom.avro.inputformat;

import java.io.IOException;
import java.rmi.server.UID;

import org.apache.avro.Schema;
import org.apache.avro.Schema.Parser;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.mapred.FsInput;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.serde2.avro.AvroGenericRecordWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

/**
 * RecordReader optimized against Avro GenericRecords that returns to record as
 * the value of the k-v pair, as Hive requires.
 */
public class CustomAvroGenericRecordReader<k, v> extends RecordReader<NullWritable, AvroGenericRecordWritable> {

    protected Configuration conf;

    private org.apache.avro.file.FileReader<GenericRecord> reader;
    private long start;
    private long stop;
    private NullWritable key = null;
    private AvroGenericRecordWritable value = null;

    private Schema INPUT_SCHEMA;

    private Schema OUTPUT_SCHEMA;

    private UID recordReaderID;

    @Override
    public void initialize(InputSplit genericSplit, TaskAttemptContext context) throws IOException {

        INPUT_SCHEMA = new Parser().parse(this.getClass().getClassLoader().getResourceAsStream("input.avsc"));

        OUTPUT_SCHEMA = new Parser().parse(this.getClass().getClassLoader().getResourceAsStream("output.avsc"));

        FileSplit fileSplit = (FileSplit) genericSplit;
        this.conf = context.getConfiguration();
        Path path = fileSplit.getPath();
        FileSystem fs = path.getFileSystem(this.conf);
        GenericDatumReader<GenericRecord> gdr = new GenericDatumReader<GenericRecord>(INPUT_SCHEMA);

        this.reader = new DataFileReader<GenericRecord>(new FsInput(path, conf), gdr);
        this.reader.sync(fileSplit.getStart());
        this.start = reader.tell();
        this.stop = fileSplit.getStart() + fileSplit.getLength();
        this.recordReaderID = new UID();

    }

    ConvertAvroHelper convertHelper = new ConvertAvroHelper();

    @Override
    public boolean nextKeyValue() throws IOException, InterruptedException {

        if (!reader.hasNext() || reader.pastSync(stop)) {
            return false;
        }

        GenericRecord r = (GenericData.Record) reader.next();

        GenericRecord outputRecord = convertHelper.convertData(r, INPUT_SCHEMA, OUTPUT_SCHEMA);
        
        value = new AvroGenericRecordWritable();

        value.setRecord(outputRecord);

        value.setRecordReaderID(recordReaderID);

        value.setFileSchema(OUTPUT_SCHEMA);

        return true;
    }

    @Override
    public NullWritable getCurrentKey() {
        return NullWritable.get();
    }

    @Override
    public AvroGenericRecordWritable getCurrentValue() {
        return this.value;
    }

    public long getPos() throws IOException {
        return reader.tell();
    }

    @Override
    public float getProgress() throws IOException {
        return stop == start ? 0.0f : Math.min(1.0f, (getPos() - start) / (float) (stop - start));
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }

}
