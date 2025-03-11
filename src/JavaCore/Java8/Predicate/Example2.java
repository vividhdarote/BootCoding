package JavaCore.Java8.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example2 {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6);

        for (Integer i : list) {
            if (isEven.test(i)) {
                System.out.println(i);
            }
        }


    }
}
