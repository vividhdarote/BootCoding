package JavaCore.Java8.Streams.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitAndSkip {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 124, 123, 34, 55, 12, 14, 15, 17, 16, 1, 2, 3, 5, 6, 7, 8, 9, 10, 10, 2, 4, 5, 2, 4, 5, 10, 10);

        List<Integer> skipAndLimit = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a, b) -> b - a)
                .limit(4)    //first 4 values
                .skip(1)   //skip the first occurred value
                .collect(Collectors.toList());
        System.out.println(skipAndLimit);


        List<Integer> iterate = Stream.iterate(0, x -> x + 1)
                .limit(101)   //till 100
                .skip(1)           //skip first seed(starting) i.e 0;
                .collect(Collectors.toList());
        System.out.println(iterate);
    }
}
