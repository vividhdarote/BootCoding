package JavaCore.FileHandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileHandle2 {
    public static void main(String[] args) {
        String csvFile = "C:/Users/Vividh/OneDrive/Desktop/BootCoding/src/JavaCore/FileHandling/Csv.csv";
        String cvsSplitBy = ",";

        List<String[]> dataList = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(csvFile);
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {


            if (br.readLine() != null) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(cvsSplitBy);
                    dataList.add(data);
                }
            }

            for (String[] data : dataList) {
                System.out.println("Name=" + data[0] + ", Age=" + data[1] + ", City=" + data[2] );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}