package JavaCore.Java8.Function_Interfaces.Consumer;

//Represents an operation that accepts a single input argument and returns no result.
// Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
//Performs this operation on the given argument: void accept(T t);


import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {

        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Vividh");

        Consumer<List<Integer>> listConsumer = li -> {
            for (Integer s : li) {
                System.out.println(s + 100);
            }
        };

        listConsumer.accept(Arrays.asList(1, 2, 3, 4));
    }
}
