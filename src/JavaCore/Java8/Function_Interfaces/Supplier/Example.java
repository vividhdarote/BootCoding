package JavaCore.Java8.Function_Interfaces.Supplier;

//This is a functional interface whose functional method is get().
// Single Abstract method


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {

        Supplier<Integer> supp = () -> 1;
        System.out.println(supp.get());


        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }


    }
}
