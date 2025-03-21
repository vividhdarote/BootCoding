package JavaCore.Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("Laptop", "Phone", "Tablet", "Laptop", "Watch", "Phone");

        Set<String> duplicates = products.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(duplicates);
    }
}
