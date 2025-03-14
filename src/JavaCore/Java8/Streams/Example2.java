package JavaCore.Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> evenOddMap = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

        List<Integer> evenNumber = evenOddMap.get(true);
        List<Integer> oddNumber = evenOddMap.get(false);

        System.out.println("Even Numbers: " + evenNumber);
        System.out.println("Odd Number: " + oddNumber);
    }
}
