package JavaCore.Java8.Streams.Methods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peek {
    public static void main(String[] args) {

        List<Integer> filterIterate = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 10)
                .distinct()
                .sorted()
                .peek(x -> System.out.println(x))   // act as a Consumer
                .collect(Collectors.toList());
        System.out.println(filterIterate);
    }
}
