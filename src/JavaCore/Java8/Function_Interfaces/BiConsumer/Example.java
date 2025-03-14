package JavaCore.Java8.Function_Interfaces.BiConsumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example {
    public static void main(String[] args) {

        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(35);

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x + y);
        biConsumer.accept(4, 5);
    }
}
