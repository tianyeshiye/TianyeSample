package sample.avro.custom.avro.inputformat;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hive.serde2.avro.AvroGenericRecordWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

import sample.avro.custom.avro.inputformat.CustomAvroContainerInputFormat;

public class CustomAvroContainerInputFormatTest {

    public static class MyMapper extends Mapper<NullWritable, AvroGenericRecordWritable, NullWritable, Text> {

        @Override
        public void map(NullWritable key, AvroGenericRecordWritable value, Context output) throws IOException, InterruptedException {

            System.out.println("key:\t " + key);

            System.out.println("value:\t " + value);

            output.write(key, new Text(value.getRecord().toString()));
            
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) throws Exception {

        Configuration conf = new Configuration();

        Path outPath = new Path("output/output" + String.valueOf(System.currentTimeMillis()));

        FileSystem.get(conf).delete(outPath, true);

        Job job = new Job(conf, "CustomAvroContainerInputFormatTest");

        job.setInputFormatClass(CustomAvroContainerInputFormat.class);

        job.setJarByClass(CustomAvroContainerInputFormatTest.class);

        job.setMapperClass(MyMapper.class);

        job.setNumReduceTasks(0);

        job.setMapOutputKeyClass(NullWritable.class);
        job.setMapOutputValueClass(Text.class);

        FileInputFormat.addInputPath(job, new Path("input/avro"));

        org.apache.hadoop.mapreduce.lib.output.FileOutputFormat.setOutputPath(job, outPath);

        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }

}
