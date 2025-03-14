package JavaCore.Java8.Streams.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 124, 123, 34, 55, 12, 14, 15, 17, 16, 1, 2, 3, 5, 6, 7, 8, 9, 10, 10, 2, 4, 5, 2, 4, 5, 10, 10);


        //map use as Function --> used to modify
        List<Integer> mappedList = list.stream()
                .map(x -> x / 2)
                .collect(Collectors.toList());
        System.out.println(mappedList);
    }
}
