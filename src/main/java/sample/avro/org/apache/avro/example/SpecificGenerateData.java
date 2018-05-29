package sample.avro.org.apache.avro.example;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

import sample.avro.bean.C001;
import sample.avro.bean.C022;
import sample.avro.bean.C122;
import sample.avro.bean.C201;
import sample.avro.bean.CanData;
import sample.avro.bean.InputCanInfo;

public class SpecificGenerateData {

    public static void main(String[] args) throws IOException {

        CanData canData = new CanData();
        C001 C001 = new C001();
        C022 C022 = new C022();
        C122 C122 = new C122();
        C201 C201 = new C201();

        canData.setC001(C001);
        canData.setC022(C022);
        canData.setC122(C122);
        canData.setC201(C201);

        C001.setC001Dummy15(15L);
        C001.setC001Dummy16(16L);
        C001.setC001Dummy17(17L);

        C022.setC022Dummy15(15L);
        C022.setC022Dummy16(16L);
        C022.setC022Dummy17(17L);
        C022.setC022Dummy18(18L);

        C122.setC122Dummy15(15L);

        C201.setC201Dummy15(15L);

        InputCanInfo input = new InputCanInfo();

        input.setCanId("canid");
        input.setCanTime(1111111L);
        input.setCanData(canData);

        File outputfile = new File("./input/avro/input.avro");
        DatumWriter<InputCanInfo> datumWriter = new SpecificDatumWriter<InputCanInfo>(InputCanInfo.class);
        DataFileWriter<InputCanInfo> dataFileWriter = new DataFileWriter<InputCanInfo>(datumWriter);
        dataFileWriter.create(input.getSchema(), outputfile);
        dataFileWriter.append(input);
        dataFileWriter.close();
    }
}