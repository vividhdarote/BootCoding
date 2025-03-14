package JavaCore.Java8.Streams.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 124, 123, 34, 55, 12, 14, 15, 17, 16, 1, 2, 3, 5, 6, 7, 8, 9, 10, 10, 2, 4, 5, 2, 4, 5, 10, 10);

        // filter use as Predicate--> true/false;
        List<Integer> filteredList = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
