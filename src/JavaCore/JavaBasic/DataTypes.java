package JavaCore.JavaBasic;

public class  DataTypes {
    public static void main(String[] args) {

        //Primitive Data Types
         byte b = 127; // 1 Byte
         short s = 32000; // 2 Byte
         int i = 100000; // 4 Byte
         long l = 1000000000L; // 8 Byte
         float f = 5.75f; // 4 Byte
         double d = 19.99d; // 8 Byte
         char c = 'A'; // 2 Byte
         boolean flag = true; // 1 Byte

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);


        //Non Primitive Data Type

        //String
        String str = "Hello, Java!";

        // Array
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("String: " + str);
        System.out.println("Array element: " + arr[0]);
    }

}
