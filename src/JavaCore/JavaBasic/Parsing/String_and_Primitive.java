package JavaCore.JavaBasic.Parsing;

public class String_and_Primitive {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str); // String to int
        double dbl = Double.parseDouble("45.67"); // String to double

        System.out.println("int value: " + num);
        System.out.println("double value: " + dbl);




        int num1 = 456;
        String str1 = Integer.toString(num1); // int to String
        String str2 = String.valueOf(789); // another way

        System.out.println("String representation: " + str1);
        System.out.println("String using valueOf: " + str2);
    }
}
