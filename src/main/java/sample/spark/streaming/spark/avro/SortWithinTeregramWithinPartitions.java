package sample.spark.streaming.spark.avro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.spark.api.java.function.PairFlatMapFunction;

import sample.spark.streaming.CanInfoBean;
import sample.spark.streaming.TelegramInfoHash;
import scala.Tuple2;

public class SortWithinTeregramWithinPartitions implements
        PairFlatMapFunction<Iterator<Tuple2<TelegramInfoHash, CanInfoBean>>, TelegramInfoHash, List<List<CanInfoBean>>> {

    private static final long serialVersionUID = -2022345678L;

    private final int timeInterval;

    public SortWithinTeregramWithinPartitions(int timeInterval) {

        this.timeInterval = timeInterval;
    }

    public Iterator<Tuple2<TelegramInfoHash, List<List<CanInfoBean>>>> call(
            final Iterator<Tuple2<TelegramInfoHash, CanInfoBean>> tuples) throws Exception {

        return new Iterator<Tuple2<TelegramInfoHash, List<List<CanInfoBean>>>>() {

            boolean repeatedHandlerFlg = true;

            private TelegramInfoHash progress = null;

            private Tuple2<TelegramInfoHash, CanInfoBean> aheadTuple = null;

            private TreeMap<Long, List<CanInfoBean>> canUnitBeanTreeMap;

            private void ensureNexrElement() {

                if (progress != null || canUnitBeanTreeMap != null) {
                    return;
                }

                this.canUnitBeanTreeMap = new TreeMap<Long, List<CanInfoBean>>();

                if (aheadTuple != null) {

                    this.progress = aheadTuple._1;
                    addTocanUnitBeanHashMap(canUnitBeanTreeMap, aheadTuple);
                    this.aheadTuple = null;
                }

                while (tuples.hasNext()) {

                    final Tuple2<TelegramInfoHash, CanInfoBean> tuple = tuples.next();

                    if (progress == null || progress.equals(tuple._1)) {

                        this.progress = tuple._1;

                        addTocanUnitBeanHashMap(canUnitBeanTreeMap, tuple);

                    } else {

                        this.aheadTuple = tuple;
                        break;
                    }
                }
            }

            @Override
            public boolean hasNext() {

                ensureNexrElement();

                return canUnitBeanTreeMap != null && !canUnitBeanTreeMap.isEmpty();
            }

            @Override
            public Tuple2<TelegramInfoHash, List<List<CanInfoBean>>> next() {

                if (!hasNext()) {

                    return null;
                }

                Tuple2<TelegramInfoHash, List<List<CanInfoBean>>> next = new Tuple2<TelegramInfoHash, List<List<CanInfoBean>>>(
                        progress, new ArrayList<>(canUnitBeanTreeMap.values()));

                this.progress = null;
                this.canUnitBeanTreeMap = null;
                return next;
            }

            private void addTocanUnitBeanHashMap(Map<Long, List<CanInfoBean>> canUnitBeanHashMap,
                    Tuple2<TelegramInfoHash, CanInfoBean> tuple) {

                CanInfoBean canUnitBean = tuple._2;

                Long canTime = canUnitBean.getCanTime();

                List<CanInfoBean> canUnitBeanList;

                if (canUnitBeanHashMap.containsKey(canTime)) {

                    canUnitBeanList = canUnitBeanHashMap.get(canTime);

                    //// ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
                    /// repeated Handler is needed
                    if (repeatedHandlerFlg) {

                        repeatedHandler(canUnitBeanList, tuple);

                    } else {

                        canUnitBeanList.add(canUnitBean);
                    }

                } else {

                    canUnitBeanList = new ArrayList<CanInfoBean>();

                    //// ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
                    /// repeated Handler is needed
                    if (repeatedHandlerFlg) {

                        repeatedHandler(canUnitBeanList, tuple);

                    } else {

                        canUnitBeanList.add(canUnitBean);
                    }

                    canUnitBeanHashMap.put(canTime, canUnitBeanList);
                }
            }

            ///// ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
            ///// repeated Handler

            // Map<CanUnitBean.canTime, List<CanUnitBean.canId> >
            private Map<Long, List<Short>> repeatedMap = new HashMap<Long, List<Short>>();

            private long timestamp;

            // repeated canUnitBean Handler
            private void repeatedHandler(List<CanInfoBean> canUnitBeanList, Tuple2<TelegramInfoHash, CanInfoBean> tuple) {

                CanInfoBean newCanUnitBean = tuple._2;

                if (this.progress.timestamp != this.timestamp) {

                    repeatedMap = new HashMap<Long, List<Short>>();

                    this.timestamp = this.progress.timestamp;
                }

                List<Short> canIdlist = new ArrayList<Short>();

                if (repeatedMap.containsKey(newCanUnitBean.getCanTime())) {

                    canIdlist = repeatedMap.get(newCanUnitBean.getCanTime());

                    int index = canIdlist.indexOf(newCanUnitBean.getCanId());

                    if (index != -1) {

                        canUnitBeanList.set(index, newCanUnitBean);
                    } else {

                        canUnitBeanList.add(newCanUnitBean);

                        canIdlist.add(newCanUnitBean.getCanId());
                    }
                } else {

                    canUnitBeanList.add(newCanUnitBean);

                    canIdlist.add(newCanUnitBean.getCanId());

                    repeatedMap.put(newCanUnitBean.getCanTime(), canIdlist);
                }
            }
        };
    }

}