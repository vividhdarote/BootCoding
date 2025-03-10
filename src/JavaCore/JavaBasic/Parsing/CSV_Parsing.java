package JavaCore.JavaBasic.Parsing;

public class CSV_Parsing {
    public static void main(String[] args) {
        String csv = "John,30,Developer";
        String[] data = csv.split(",");

        System.out.println("Name: " + data[0]);
        System.out.println("Age: " + data[1]);
        System.out.println("Job: " + data[2]);
    }

}

