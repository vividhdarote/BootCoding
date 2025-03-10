package JavaCore.JavaBasic.Parsing;

public class PrimitiveParsing {
    public static void main(String[] args) {
        // String to int
        int intValue = Integer.parseInt("123");

        // String to double
        double doubleValue = Double.parseDouble("123.45");

        // String to float
        float floatValue = Float.parseFloat("12.34");

        // String to long
        long longValue = Long.parseLong("1234567890");

        // String to short
        short shortValue = Short.parseShort("120");

        // String to byte
        byte byteValue = Byte.parseByte("100");

        // String to boolean
        boolean boolValue = Boolean.parseBoolean("true");

        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("float: " + floatValue);
        System.out.println("long: " + longValue);
        System.out.println("short: " + shortValue);
        System.out.println("byte: " + byteValue);
        System.out.println("boolean: " + boolValue);
    }
}
