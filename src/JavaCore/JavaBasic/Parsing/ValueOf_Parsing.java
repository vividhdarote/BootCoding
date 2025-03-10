package JavaCore.JavaBasic.Parsing;

public class ValueOf_Parsing {
    public static void main(String[] args) {
        Integer intObj = Integer.valueOf("123");
        Double doubleObj = Double.valueOf("123.45");
        Boolean boolObj = Boolean.valueOf("true");

        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Boolean object: " + boolObj);
    }
}
