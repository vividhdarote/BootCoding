package JavaCore.Java8.Function_Interface;

import java.util.function.Function;

public class AllMethod {
    public static void main(String[] args) {

        Function<String,String> function1= x->x.toUpperCase();
        Function<String,String >function2= x->x.substring(0,3);

        System.out.println(function1.andThen(function2).apply("vividh"));

        // convert the 'vividh' input Into UpperCase and Substring the first 3 letter
        // Output: VIV


        Function<Integer,Integer> function3 = x->2*x;
        Function<Integer,Integer> function4 = x-> x*x*x;

        //1.andThen Method
        System.out.println(function3.andThen(function4).apply(3));   // 3->  2 * 3 = 6   then 6 ^ 3 = 216   Output: 216
        System.out.println(function4.andThen(function3).apply(3));   // 3->  3 ^ 3 = 27  then 2 * 27 = 54   Output: 54

        //2.compose Method
        System.out.println(function3.compose(function4).apply(3));  // 54 same as above (function4.andThen(function3).apply(3))

        //3.identity Method
        Function<String,String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("Vividh"));
        // Its return input as output
    }
}
