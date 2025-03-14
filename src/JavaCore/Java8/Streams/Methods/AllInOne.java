package JavaCore.Java8.Streams.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllInOne {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 124, 123, 34, 55, 12, 14, 15, 17, 16, 1, 2, 3, 5, 6, 7, 8, 9, 10, 10, 2, 4, 5, 2, 4, 5, 10, 10);

        //1.filter use as Predicate--> true/false;
        List<Integer> filteredList = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(filteredList);


        //2.map use as Function --> used to modify
        List<Integer> mappedList = filteredList.stream()
                .map(x -> x / 2)
                .collect(Collectors.toList());
        System.out.println(mappedList);


        //3.we can use this above method together
        List<Integer> collect = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .collect(Collectors.toList());
        System.out.println(collect);


        //4.to avoid duplicate--> use distinct()
        List<Integer> distinct = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinct);


        //5. (a) sort--> ascending without duplicate
        List<Integer> sorted1 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted1);

        //   (b) sort--> descending
        List<Integer> sorted2 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a, b) -> b - a)    //reversed the list
                .collect(Collectors.toList());
        System.out.println(sorted2);


        //6. limit and skip
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


        //7. peek() --> act as a Consumer
        List<Integer> filterIterate = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 10)
                .distinct()
                .sorted()
                .peek(x -> System.out.println(x))     // act as a Consumer
                .collect(Collectors.toList());
        System.out.println(filterIterate);


        //8. (a) min
        Integer i = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map(x -> x / 20)
                .distinct()
                .peek(System.out::println)
                .min((a, b) -> a - b)   // if I write (a,b)-> b - a  then, the output will be 5
                .get();
        System.out.println("Min: " + i);

        //   (b) max
        Integer i2 = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map(x -> x / 20)
                .distinct()
                .peek(System.out::println)
                .max((a, b) -> a - b)   // if I write (a,b)-> b - a  then, the output will be 0
                .get();
        System.out.println("Max: " + i2);

        //   (c) count
        Long i3 = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map(x -> x / 20)
                .distinct()
                .count();    //count() return long value & return the number of count
        System.out.println("Count: "+i3);


    }
}
