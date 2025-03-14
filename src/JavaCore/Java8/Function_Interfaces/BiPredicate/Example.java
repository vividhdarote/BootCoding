package JavaCore.Java8.Function_Interfaces.BiPredicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(34));

        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x % 2 == 0 && y % 2 == 0;
        System.out.println(biPredicate.test(2, 4));

        BiPredicate<String, Integer> biPredicate1 = (str, x) -> str.length() == x;
        System.out.println(biPredicate1.test("Vividh", 6));


        //All Methods
        BiPredicate<Integer, Integer> predicate1 = (x, y) -> x % 2 == 0 && y % 2 == 0;
        BiPredicate<Integer, Integer> predicate2 = (x, y) -> x < 100 && y > 0;

        //1.and
        System.out.println(predicate1.and(predicate2).test(98, 2));

        //2.or
        System.out.println(predicate1.or(predicate2).test(120, 0));

        //3. negate()
        System.out.println(predicate1.negate().test(24, 21));
        System.out.println(predicate2.negate().test(98, -1));
    }
}
