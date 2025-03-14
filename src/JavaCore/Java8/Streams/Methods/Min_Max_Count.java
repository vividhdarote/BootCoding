package JavaCore.Java8.Streams.Methods;

import java.util.stream.Stream;

public class Min_Max_Count {
    public static void main(String[] args) {

        //   (a) min
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
