package JavaCore.Java8.Streams.Methods;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {
    public static void main(String[] args) {


        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );
        System.out.println(listOfLists.get(1).get(1));
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());


        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );
        System.out.println(sentences
                .stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase)
                .toList());
    }
}
