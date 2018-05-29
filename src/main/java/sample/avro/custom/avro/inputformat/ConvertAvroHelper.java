package sample.avro.custom.avro.inputformat;

import java.util.HashMap;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;

public class ConvertAvroHelper {

    public GenericRecord convertData(GenericRecord oldRecord, Schema inputSchema, Schema outputSchema) {

        HashMap<String, Object> valueMap = new HashMap<String, Object>();

        oldRecord.getSchema().getFields().stream().forEach(field -> {

            String fieldName = field.name().intern();

            if (fieldName.equals("canId") && oldRecord.get(field.pos()) != null) {

                valueMap.put(fieldName, oldRecord.get(field.pos()));

            } else if (fieldName.equals("canTime") && oldRecord.get(field.pos()) != null) {

                valueMap.put(fieldName, oldRecord.get(field.pos()));

            } else if (fieldName.equals("canData") && oldRecord.get(field.pos()) != null) {

                handleCandataData((GenericRecord) oldRecord.get(field.pos()), valueMap);
            }
        });

        GenericRecord newRecord = new GenericData.Record(outputSchema);

        valueMap.entrySet().stream().forEach(e -> {

            String k = e.getKey();
            Object v = e.getValue();

            if (existKey(outputSchema, k)) {
                setRecordValue(newRecord, k, v);
            }

        });

        return newRecord;
    }

    private void setRecordValue(GenericRecord record, String field, Object value) {

        Schema schema = record.getSchema();

        if (existKey(schema, field)) {
            record.put(field, value);
        }
    }

    private void handleCandataData(GenericRecord genericRecord, HashMap<String, Object> valueMap) {

        genericRecord.getSchema().getFields().forEach(field -> {

            if (genericRecord.get(field.pos()) != null) {

                handleCommonData((GenericRecord) genericRecord.get(field.pos()), valueMap);
            }
        });

    }

    private void handleCommonData(GenericRecord genericRecord, HashMap<String, Object> valueMap) {

        genericRecord.getSchema().getFields().forEach(field -> {

            if (genericRecord.get(field.pos()) != null) {

                valueMap.put(field.name().intern(), genericRecord.get(field.pos()));
            }
        });
    }

    private boolean existKey(Schema schema, String key) {

        return schema.getFields().stream().anyMatch(field -> field.name().intern().equals(key));
    }

    // private void handleCandataData(List<IndexedRecord> indexedRecordList,
    // long baseTime,
    // TreeMap<Long, HashMap<String, Object>> treeMap) {
    //
    // indexedRecordList.forEach(indexedRecord -> {
    //
    // indexedRecord.getSchema().getFields().forEach(field -> {
    //
    // if (!field.name().intern().equals("dataType") &&
    // indexedRecord.get(field.pos()) != null) {
    //
    // handleCommonData((IndexedRecord) indexedRecord.get(field.pos()),
    // baseTime, treeMap);
    // }
    //
    // });
    // });
    // }
    //
    // private void handleCommonData(IndexedRecord indexedRecord, long baseTime,
    // TreeMap<Long, HashMap<String, Object>> treeMap) {
    //
    // List<Integer> timeOffsetList = (List<Integer>) indexedRecord.get(0);
    //
    // indexedRecord.getSchema().getFields().forEach(field -> {
    //
    // if (!field.name().intern().equals("timeoffset") &&
    // indexedRecord.get(field.pos()) != null) {
    //
    // List<Object> objList = (List<Object>) indexedRecord.get(field.pos());
    //
    // for (int j = 0; j < timeOffsetList.size(); j++) {
    //
    // long timestamp = baseTime + timeOffsetList.get(j);
    //
    // HashMap<String, Object> valueMap = getValueFromTreeMap(treeMap,
    // timestamp);
    //
    // valueMap.put(field.name().intern(), convertNull(objList, j));
    // }
    //
    // }
    //
    // });
    // }
    //
    // private HashMap<String, Object> getValueFromTreeMap(TreeMap<Long,
    // HashMap<String, Object>> treeMap, long key) {
    //
    // if (!treeMap.containsKey(key)) {
    //
    // HashMap<String, Object> valueMap = new HashMap<String, Object>();
    //
    // treeMap.put(key, valueMap);
    // }
    //
    // return treeMap.get(key);
    // }

    //
    // private <T> T convertNull(List<T> list, int index) {
    //
    // if (list.size() > index) {
    // return list.get(index);
    // } else {
    // return null;
    // }
    // }

}
