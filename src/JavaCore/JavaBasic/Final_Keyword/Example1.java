package JavaCore.JavaBasic.Final_Keyword;

public class Example1 {
    public static void main(String[] args) {
        final int max_value = 100;
        System.out.println("Max value: " + max_value);

        // max_value = 200; // Error: cannot assign a value to final variable
    }
}
