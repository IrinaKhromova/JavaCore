package lesson5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CreateFileClass {

    public static ArrayList<FIleObject> fIleObjectArrayList = new ArrayList<>();
    public static final String pathToFile = "dz5.csv";
    public static final String title = "value1"+ ";" + "value2"
            + ";" + "value3" + ";"+ System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        createFileObjects();
        writeStream();

        System.out.println(readToObject());
    }

    public static void createFileObjects(){
        Random random = new Random();

        for(int i = 1; i < 10; i++){
            fIleObjectArrayList.add( new FIleObject(i, random.nextInt(100), random.nextInt(200)));
        }
    }

    public static void writeStream() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(pathToFile)){
            for(byte b :title.getBytes(StandardCharsets.UTF_8)){
                fileOutputStream.write(b);
            }
            for(FIleObject fIleObject : fIleObjectArrayList){
                String raw = fIleObject.getValue() + ";" + fIleObject.getValueFrom()
                        + ";" + fIleObject.getValueTo() + ";"+ System.getProperty("line.separator");
                for(byte b :raw.getBytes(StandardCharsets.UTF_8)){
                    fileOutputStream.write(b);
                }
            }
        }
    }

    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();
            appData.setHeader( line.split(";"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
               // System.out.println(Arrays.asList(values));
            }
        }

        int[][] resultData = new int[records.size()][3];

        for(int i = 0; i < records.size(); i++){
            for(int j = 0;j < records.get(i).size();j++){
                resultData[i][j] = Integer.valueOf(records.get(i).get(j));
                System.out.print(resultData[i][j] + "; ");
            }
            System.out.println();
        }
        appData.setData(resultData);
        return appData;

    }


}