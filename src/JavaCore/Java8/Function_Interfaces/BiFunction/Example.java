package JavaCore.Java8.Function_Interfaces.BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Example {
    public static void main(String[] args) {

        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Vividh"));    //6

        BiFunction<String, String, Integer> function1 = (x, y) -> x.length() + y.length();
        System.out.println(function1.apply("Vividh", "Anshul"));    //12
    }
}
