package JavaCore.JavaBasic.Type_Casting;

//Converting a larger type to a smaller type.
//Data loss is possible if the value exceeds the range of the target type.
//double → float → long → int → short → byte

public class Explicit {
    public static void main(String[] args) {
        double doubleNum = 99.99;
        float floatNum = (float) doubleNum; // double to float
        long longNum = (long) floatNum; // float to long
        int intNum = (int) longNum; // long to int
        short shortNum = (short) intNum; // int to short
        byte byteNum = (byte) shortNum; // short to byte

        System.out.println("double value: " + doubleNum);
        System.out.println("float value: " + floatNum);
        System.out.println("long value: " + longNum);
        System.out.println("int value: " + intNum);
        System.out.println("short value: " + shortNum);
        System.out.println("byte value: " + byteNum);
    }
}
