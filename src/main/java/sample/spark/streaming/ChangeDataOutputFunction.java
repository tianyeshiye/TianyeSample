package sample.spark.streaming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.spark.api.java.function.PairFlatMapFunction;

import scala.Tuple2;

public class ChangeDataOutputFunction
        implements PairFlatMapFunction<Iterator<Tuple2<TelegramInfoHash, CanInfoBean>>, TelegramInfoHash, List<CanInfoBean>> {
    private static final long serialVersionUID = -2022345678L;

    public ChangeDataOutputFunction() {
    }

    public Iterator<Tuple2<TelegramInfoHash, List<CanInfoBean>>> call(
            final Iterator<Tuple2<TelegramInfoHash, CanInfoBean>> tuples) throws Exception {

        return new Iterator<Tuple2<TelegramInfoHash, List<CanInfoBean>>>() {

            private TelegramInfoHash progress = null;
            private List<CanInfoBean> message = null;
            private Tuple2<TelegramInfoHash, CanInfoBean> aheadTuple = null;

            //
            private void ensureNexrElement() {

                if (progress != null || message != null) {
                    return;
                }

                this.message = new ArrayList<>();

                if (aheadTuple != null) {
                    this.progress = aheadTuple._1;
                    this.message.add(aheadTuple._2);
                    this.aheadTuple = null;
                }

                while (tuples.hasNext()) {
                    final Tuple2<TelegramInfoHash, CanInfoBean> tuple = tuples.next();
                    if (progress == null || progress.equals(tuple._1)) {
                        this.progress = tuple._1;
                        this.message.add(tuple._2);
                    } else {
                        this.aheadTuple = tuple;
                        break;
                    }
                }
            }

            @Override
            public boolean hasNext() {
                ensureNexrElement();
                return message != null && !message.isEmpty();
            }

            @Override
            public Tuple2<TelegramInfoHash, List<CanInfoBean>> next() {
                if (!hasNext()) {
                    return null;
                }
                Tuple2<TelegramInfoHash, List<CanInfoBean>> next = new Tuple2<TelegramInfoHash, List<CanInfoBean>>(progress,
                        message);
                this.progress = null;
                this.message = null;
                return next;
            }
        };
    }
}
