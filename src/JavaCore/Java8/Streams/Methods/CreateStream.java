package JavaCore.Java8.Streams.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> myStream = list.stream();

        String [] array ={"apple", "banana", "cherry"};
        Stream<String> arrayStream = Arrays.stream(array);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        Stream<Integer> limit = Stream.iterate(0, x -> x + 1).limit(100);   //unaryOperator used here

        Stream<String> limit1 = Stream.generate(() -> "hello").limit(5);   //supplier used here
        Stream<Integer> limit2 = Stream.generate(() -> (int) Math.random() * 100).limit(5);


    }
}
