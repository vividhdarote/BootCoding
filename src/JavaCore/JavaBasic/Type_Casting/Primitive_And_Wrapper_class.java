package JavaCore.JavaBasic.Type_Casting;

//Autoboxing: Converting primitives to their wrapper classes.
//Unboxing: Converting wrapper classes back to primitives.

public class Primitive_And_Wrapper_class {
    public static void main(String[] args) {
        int num = 50;
        Integer obj = num; // autoboxing (int to Integer)
        int newNum = obj; // unboxing (Integer to int)

        System.out.println("Primitive int: " + num);
        System.out.println("Wrapper Integer: " + obj);
        System.out.println("Unboxed int: " + newNum);
    }
}
