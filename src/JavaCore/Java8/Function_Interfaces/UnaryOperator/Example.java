package JavaCore.Java8.Function_Interfaces.UnaryOperator;

//public interface UnaryOperator<T> extends Function<T, T>
//Represents an operation on a single operand that produces a result of the same type as its operand.
//This is a specialization of Function for the case where the operand and result are of the same type.


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Example {
    public static void main(String[] args) {

        Function<Integer, Integer> function = x -> x * x;
        System.out.println(function.apply(5));

        //same as above, when input type and return type is same
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(5));

        UnaryOperator<String> unaryOperator1 = str -> str.toLowerCase();
        System.out.println(unaryOperator1.apply("VIvidh"));
    }
}
