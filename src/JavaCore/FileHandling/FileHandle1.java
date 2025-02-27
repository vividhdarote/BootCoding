package JavaCore.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandle1 {
    public static void main(String[] args) {
        String csvFile = "C:/Users/Vividh/OneDrive/Desktop/BootCoding/src/JavaCore/FileHandling/Csv.csv";
        String cvsSplitBy = ",";

        List<String[]> dataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            StringBuilder headerLine = new StringBuilder(br.readLine());
            if (headerLine != null) {
                String line;
                while ((line = br.readLine()) != null) {
                    StringBuilder currentLine = new StringBuilder(line);
                    String[] data = currentLine.toString().split(cvsSplitBy);
                    dataList.add(data);
                }
            }


            for (String[] data : dataList) {
                System.out.println("Name=" + data[0] + ", Age=" + data[1] + ", City=" + data[2]);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}