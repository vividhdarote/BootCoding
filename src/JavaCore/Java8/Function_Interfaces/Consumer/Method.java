package JavaCore.Java8.Function_Interfaces.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Method {
    public static void main(String[] args) {

        Consumer<List<Integer>> listConsumer1 = li -> {
            for (Integer s : li) {
                System.out.println(s + 100);
            }
        };

        Consumer<List<Integer>> listConsumer2 = li -> {
            for (Integer s : li) {
                System.out.println(s);
            }
        };

        //  andThen Method
        listConsumer2.andThen(listConsumer1).accept(Arrays.asList(1, 2, 3, 4));

    }
}
