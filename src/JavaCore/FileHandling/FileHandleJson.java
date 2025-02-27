package JavaCore.FileHandling;


import java.io.File;
import java.util.Scanner;
import org.json.JSONObject;


import static java.lang.System.*;

public class FileHandleJson {
    public static  void main(String[] args) {
        try{
            File file =new File("C:/Users/Vividh/OneDrive/Desktop/BootCoding/src/JavaCore/FileHandling/file.json");
            Scanner sc=new Scanner(file);
            StringBuilder jsondata=new StringBuilder();
            while(sc.hasNextLine()){
                jsondata.append(sc.nextLine());
            }
            sc.close();
            JSONObject jsonObject=new JSONObject(jsondata.toString());

            String name=jsonObject.getString("name");
            int age=jsonObject.getInt("age");
            String city= jsonObject.getString("city");


            out.println("Name: "+name);
            out.println("Age: "+age);
            out.println("City: "+city);

        }
        catch (Exception e){
            out.println(e);

        }
    }
}
