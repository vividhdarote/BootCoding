package JavaCore.JavaBasic.Type_Casting;

public class Implicit {
    public static void main(String[] args) {
        int num = 100;
        long longNum = num; // int to long
        float floatNum = longNum; // long to float
        double doubleNum = floatNum; // float to double

        System.out.println("int value: " + num);
        System.out.println("long value: " + longNum);
        System.out.println("float value: " + floatNum);
        System.out.println("double value: " + doubleNum);
    }
}
