package JavaCore.Java8.Function_Interfaces.BinaryOperator;

//public interface BinaryOperator<T> extends BiFunction<T,T,T>
//Represents an operation upon two operands of the same type, producing a result of the same type as the operands.
// This is a specialization of BiFunction for the case where the operands and the result are all of the same type.


import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Example {
    public static void main(String[] args) {

        BiFunction<String, String, String> biFunction = (str1, str2) -> (str1 + str2).toLowerCase();
        System.out.println(biFunction.apply("Vividh", "Anshul"));

        //same as above when the two input type is same and return type is also same
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1.toLowerCase() + str2.toLowerCase();
        System.out.println(binaryOperator.apply("Vividh", "Anshul"));
    }
}
