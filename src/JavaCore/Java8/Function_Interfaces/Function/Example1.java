package JavaCore.Java8.Function_Interfaces.Function;

//This is a functional interface whose functional method is apply(Object).
// R apply(T t) – applies this function to the given argument.
// written format: Function<T, R>
//Type parameters:
//<T> – the type of the input to the function
//<R> – the type of the result of the function


import java.util.function.Function;

public class Example1 {
    public static void main(String[] args) {

        Function<String, Integer> function = x -> x.length();
        System.out.println(function.apply("Vividh"));
    }
}
