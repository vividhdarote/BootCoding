package JavaCore.Java8.Predicate;

import java.util.function.Predicate;

public class Example3 {
    public static void main(String[] args) {

        Predicate<String> isStartWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';
        Predicate<String> isEndWithLetterH = x-> x.toLowerCase().charAt(x.length()-1) == 'h';

        System.out.println("Hello get Entry: " + isStartWithLetterV.test("Hello"));
        System.out.println("Vividh get Entry: " + isStartWithLetterV.test("Vividh"));

        System.out.println(isEndWithLetterH.test("Vividh"));



    }
}
