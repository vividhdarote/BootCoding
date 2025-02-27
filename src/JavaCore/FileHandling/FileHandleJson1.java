package JavaCore.FileHandling;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileReader;
import java.io.IOException;

public class FileHandleJson1 {

    public static void main(String[] args) {
        String jsonFilePath = "C:/Users/Vividh/OneDrive/Desktop/BootCoding/src/JavaCore/FileHandling/file1.json";

        try (FileReader reader = new FileReader(jsonFilePath)) {
            int character;
            StringBuilder jsonData = new StringBuilder();
            while ((character = reader.read()) != -1) {
                jsonData.append((char) character);
            }

            JSONArray jsonArray = new JSONArray(jsonData.toString());

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                String name = jsonObject.getString("name");
                int age = jsonObject.getInt("age");
                String city = jsonObject.getString("city");

                System.out.println("Person " + (i + 1) + ":");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("City: " + city);
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.JSONException e) {
            System.out.println("Error parsing JSON: " + e.getMessage());
        }
    }
}