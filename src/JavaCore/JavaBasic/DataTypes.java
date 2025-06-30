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

        for(int num: arr) {
            System.out.println("Array element: " + num);
        }
    }

}


// 1. What are the primitive data types in Java?
// 2. How many bytes does a byte data type occupy in Java?
// 3. What is the range of values for a short data type in Java?
// 4. How do you declare a long variable in Java?
// 5. What is the difference between float and double data types in Java?
// answer: float is single precision (32 bits) and double is double precision (64 bits).
// 6. How do you declare a character variable in Java?
// 7. What is the purpose of the boolean data type in Java?
// 8. How do you create a string in Java?
// 9. What is the difference between primitive and non-primitive data types in Java?
// answer: Primitive data types are predefined by the language and store simple values,
// while non-primitive data types are created by the programmer and can store complex objects or collections of values.
// 10. How do you declare and initialize an array in Java?
// 11. Can you store a decimal value in a byte data type in Java? NO
// 12. What happens if you try to assign a value outside the range of a short data type in Java?
// It will result in a compile-time error or data loss if the value is implicitly casted.
// 13. How do you convert a float to an int in Java?
// 14. What is the default value of a boolean variable in Java? false
// 15. How do you access an element in an array in Java?
// 16. Can you change the value of a string in Java?
// No, strings are immutable in Java. You can create a new string with the desired value instead.
// 17. What is the size of a char data type in Java?  2 bytes
// 18. How do you declare a variable of type double in Java?
// 19. What is the significance of the 'L' suffix in a long literal in Java?
// 20. How do you check if a boolean variable is true or false in Java?
// 21. Can you store multiple values of different data types in a single variable in Java?
// 22. How do you find the length of a string in Java?
// You can use the `length()` method of the String class.
// 23. What is the difference between an array and a string in Java?

