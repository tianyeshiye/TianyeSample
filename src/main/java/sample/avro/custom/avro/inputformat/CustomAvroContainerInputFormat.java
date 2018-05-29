package sample.avro.custom.avro.inputformat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

public class CustomAvroContainerInputFormat<K, V> extends FileInputFormat<K, V> {

    public RecordReader<K, V> createRecordReader(InputSplit split, TaskAttemptContext context) throws IOException {

        return new CustomAvroGenericRecordReader();
    }

    @Override
    protected List<FileStatus> listStatus(JobContext job) throws IOException {
        List<FileStatus> result = new ArrayList<FileStatus>();

        for (FileStatus file : super.listStatus(job)) {

            result.add(file);
        }

        return result;
    }

}
