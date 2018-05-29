package sample.spark.streaming;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;

import scala.Tuple2;

public class WindowStreamingDriver {

    public static void main(String[] args) throws Exception {
        SparkConf conf = new SparkConf().setAppName("StreamingDriver").setMaster("local[1]");
        JavaSparkContext sc = new JavaSparkContext(conf);

        TelegramInfoHash telegramHash1 = new TelegramInfoHash("1111", 1506787111000L);

        CanInfoBean canUnitBean1_00_1000 = Unit.createCanUnitBean((short) 0x00, "1506787111000");
        CanInfoBean canUnitBean1_0E_1000 = Unit.createCanUnitBean((short) 0x0E, "1506787111000");

        CanInfoBean canUnitBean1_01_1000 = Unit.createCanUnitBean((short) 0x01, "1506787111000");
        CanInfoBean canUnitBean1_22_1000 = Unit.createCanUnitBean((short) 0x22, "1506787111000");
        CanInfoBean canUnitBean1_122_1000 = Unit.createCanUnitBean((short) 0x122, "1506787111000");
        CanInfoBean canUnitBean1_201_1000 = Unit.createCanUnitBean((short) 0x201, "1506787111000");

        CanInfoBean canUnitBean1_01_1010 = Unit.createCanUnitBeanNull((short) 0x01, "1506787111010");
        CanInfoBean canUnitBean1_22_1010 = Unit.createCanUnitBeanNull((short) 0x22, "1506787111010");
        CanInfoBean canUnitBean1_122_1010 = Unit.createCanUnitBeanNull((short) 0x122, "1506787111010");
        CanInfoBean canUnitBean1_201_1010 = Unit.createCanUnitBeanNull((short) 0x201, "1506787111010");

        CanInfoBean canUnitBean1_01_1020 = Unit.createCanUnitBean2((short) 0x01, "1506787111020");
        CanInfoBean canUnitBean1_22_1020 = Unit.createCanUnitBean2((short) 0x22, "1506787111020");
        CanInfoBean canUnitBean1_122_1020 = Unit.createCanUnitBean2((short) 0x122, "1506787111020");
        CanInfoBean canUnitBean1_201_1020 = Unit.createCanUnitBean2((short) 0x201, "1506787111020");

        CanInfoBean canUnitBean1_01_1030 = Unit.createCanUnitBean2((short) 0x01, "1506787111030");
        CanInfoBean canUnitBean1_22_1030 = Unit.createCanUnitBean2((short) 0x22, "1506787111030");
        CanInfoBean canUnitBean1_122_1030 = Unit.createCanUnitBean2((short) 0x122, "1506787111030");
        CanInfoBean canUnitBean1_201_1030 = Unit.createCanUnitBean2((short) 0x201, "1506787111030");

        CanInfoBean canUnitBean1_00_2000 = Unit.createCanUnitBean((short) 0x00, "1506787112000");
        CanInfoBean canUnitBean1_0E_2000 = Unit.createCanUnitBean((short) 0x0E, "1506787112000");

        CanInfoBean canUnitBean1_01_2000 = Unit.createCanUnitBean((short) 0x01, "1506787112000");
        CanInfoBean canUnitBean1_22_2000 = Unit.createCanUnitBean((short) 0x22, "1506787112000");
        CanInfoBean canUnitBean1_122_2000 = Unit.createCanUnitBean((short) 0x122, "1506787112000");
        CanInfoBean canUnitBean1_201_2000 = Unit.createCanUnitBean((short) 0x201, "1506787112000");

        CanInfoBean canUnitBean1_01_2010 = Unit.createCanUnitBeanNull((short) 0x01, "1506787112010");
        CanInfoBean canUnitBean1_22_2010 = Unit.createCanUnitBeanNull((short) 0x22, "1506787112010");
        CanInfoBean canUnitBean1_122_2010 = Unit.createCanUnitBeanNull((short) 0x122, "1506787112010");
        CanInfoBean canUnitBean1_201_2010 = Unit.createCanUnitBeanNull((short) 0x201, "1506787112010");

        CanInfoBean canUnitBean1_00_3000 = Unit.createCanUnitBean((short) 0x00, "1506787113000");
        CanInfoBean canUnitBean1_0E_3000 = Unit.createCanUnitBean((short) 0x0E, "1506787113000");

        CanInfoBean canUnitBean1_01_3010 = Unit.createCanUnitBean((short) 0x01, "1506787113010");
        CanInfoBean canUnitBean1_22_3020 = Unit.createCanUnitBean((short) 0x22, "1506787113020");
        CanInfoBean canUnitBean1_122_3030 = Unit.createCanUnitBean((short) 0x122, "1506787113030");
        CanInfoBean canUnitBean1_201_3040 = Unit.createCanUnitBean((short) 0x201, "1506787113040");

        // 1506787222000 0x01 0x22 0x122 0x201
        TelegramInfoHash telegramHash2 = new TelegramInfoHash("2222", 1506787222000L);

        CanInfoBean canUnitBean2_00_2000 = Unit.createCanUnitBean((short) 0x00, "1506787222010");
        CanInfoBean canUnitBean2_0E_2000 = Unit.createCanUnitBean((short) 0x0E, "1506787222010");

        CanInfoBean canUnitBean2_01_2000 = Unit.createCanUnitBean((short) 0x01, "1506787222010");
        CanInfoBean canUnitBean2_22_2000 = Unit.createCanUnitBean((short) 0x22, "1506787222010");
        CanInfoBean canUnitBean2_122_2000 = Unit.createCanUnitBean((short) 0x122, "1506787222010");
        CanInfoBean canUnitBean2_201_2000 = Unit.createCanUnitBean((short) 0x201, "1506787222010");

        CanInfoBean canUnitBean2_00_3000 = Unit.createCanUnitBean((short) 0x00, "1506787223010");
        CanInfoBean canUnitBean2_0E_3000 = Unit.createCanUnitBean((short) 0x0E, "1506787223010");

        CanInfoBean canUnitBean2_01_3000 = Unit.createCanUnitBean((short) 0x01, "1506787223010");
        CanInfoBean canUnitBean2_22_3000 = Unit.createCanUnitBean((short) 0x22, "1506787223010");
        CanInfoBean canUnitBean2_122_3000 = Unit.createCanUnitBean((short) 0x122, "1506787223010");
        CanInfoBean canUnitBean2_201_3000 = Unit.createCanUnitBean((short) 0x201, "1506787223010");

        CanInfoBean canUnitBean2_00_4000 = Unit.createCanUnitBean((short) 0x00, "1506787224010");
        CanInfoBean canUnitBean2_0E_4000 = Unit.createCanUnitBean((short) 0x0E, "1506787224010");

        CanInfoBean canUnitBean2_01_4010 = Unit.createCanUnitBean((short) 0x01, "1506787224010");
        CanInfoBean canUnitBean2_22_4020 = Unit.createCanUnitBean((short) 0x22, "1506787224020");
        CanInfoBean canUnitBean2_122_4030 = Unit.createCanUnitBean((short) 0x122, "1506787224030");
        CanInfoBean canUnitBean2_201_4040 = Unit.createCanUnitBean((short) 0x201, "1506787224040");

        JavaStreamingContext jssc = new JavaStreamingContext(sc, Durations.milliseconds(1000));

        JavaRDD<Tuple2<TelegramInfoHash, CanInfoBean>> rdd = jssc.sparkContext()
                .parallelize(Arrays.asList(

                        // 1506787111000
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_00_1000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_0E_1000),

                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_01_1000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_22_1000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_122_1000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_201_1000),

                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_01_1010),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_22_1010),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_122_1010),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_201_1010),

                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_01_1020),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_22_1020),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_122_1020),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_201_1020),

                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_01_1030),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_22_1030),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_122_1030),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_201_1030),

                        // 1506787113000 1506787113000 1506787113000
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_00_3000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_0E_3000),

                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_01_3010),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_22_3020),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_122_3030),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_201_3040),

                        // 1506787112000
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_00_2000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_0E_2000),

                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_01_2000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_22_2000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_122_2000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_201_2000),

                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_01_2010),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_22_2010),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_122_2010),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash1, canUnitBean1_201_2010),

                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_00_2000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_0E_2000),

                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_01_2000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_22_2000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_122_2000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_201_2000),

                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_00_3000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_0E_3000),

                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_01_3000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_22_3000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_122_3000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_201_3000),

                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_00_4000),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_0E_4000),

                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_01_4010),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_22_4020),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_122_4030),
                        new Tuple2<TelegramInfoHash, CanInfoBean>(telegramHash2, canUnitBean2_201_4040)));

        Queue<JavaRDD<Tuple2<TelegramInfoHash, CanInfoBean>>> queue = new ArrayDeque<>();
        queue.add(rdd);
        queue.add(rdd);
        queue.add(rdd);
        queue.add(rdd);

        JavaDStream<Tuple2<TelegramInfoHash, CanInfoBean>> inputJavaDStream = jssc.queueStream(queue);

        System.out.println("************inputJavaDStream ********************************");
        System.out.println("************************************************************");

        JavaPairDStream<TelegramInfoHash, List<CanInfoBean>> inputListJavaDStream = inputJavaDStream
                .mapPartitionsToPair(new ChangeDataOutputFunction());

        JavaPairDStream<TelegramInfoHash, List<CanInfoBean>> inputListJavaDStreamWindow = inputListJavaDStream
                .window(Durations.milliseconds(3000), Durations.milliseconds(1000));

        JavaPairDStream<TelegramInfoHash, List<CanInfoBean>> outputJavaPairDStream = inputListJavaDStreamWindow
                .mapPartitionsToPair(new ChangeDataStreamingFunction());

        outputJavaPairDStream.print();

        jssc.start();

        jssc.awaitTermination();
    }

}
