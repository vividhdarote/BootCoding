package JavaCore.FileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandle3 {
    public static void main(String[] args) {
        String inputFile = "C:/Users/Vividh/OneDrive/Desktop/BootCoding/src/JavaCore/FileHandling/Csv.csv";

        String outputFile = "C:/Users/Vividh/OneDrive/Desktop/BootCoding/src/JavaCore/FileHandling/Csv1.csv";  //change name of output file
        String cvsSplitBy = ",";

        List<String[]> dataList = new ArrayList<>();

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                FileOutputStream fos = new FileOutputStream(outputFile);
                PrintWriter pw = new PrintWriter(fos)
        ) {
            String line;
            if ((line = br.readLine()) != null) {
                pw.println(line); // Write the header to the output file
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(cvsSplitBy);
                    dataList.add(data);
                    pw.println(line);
                }
            }

            // Displaying the data
            for (String[] data : dataList) {
                System.out.println("Name=" + data[0] + ", Age=" + data[1] + ", City=" + data[2]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}