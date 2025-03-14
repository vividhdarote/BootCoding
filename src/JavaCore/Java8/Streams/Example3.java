package JavaCore.Java8.Streams;

import java.util.stream.Stream;

public class Example3 {
    public static void main(String[] args) {

        int number = 4;
        String result = Stream.of(number)
                .map(x -> x % 2 == 0 ? "Even" : "Odd")
                .findFirst()
                .orElse("Unknown");
        System.out.println("The number " + number + " is: " + result);
    }
}
