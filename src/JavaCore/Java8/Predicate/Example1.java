package JavaCore.Java8.Predicate;

//@FunctionalInterface
//Boolean value function: true/false
// Having single method of interface:  boolean test(T t);


import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {
        Predicate<Integer> salaryGreaterThanOneLakh = (x) -> x > 100000;
        System.out.println(salaryGreaterThanOneLakh.test(10));

        Predicate<Integer> salaryLessThanOneLakh = x -> x < 100000;
        System.out.println(salaryLessThanOneLakh.test(99999));
    }
}


// Same Logic use in Predicate

// private Boolean fun (int x){
//     if(x>100000){
//             return true;
//      }
//      else{
//             return false;
//      }
// }
