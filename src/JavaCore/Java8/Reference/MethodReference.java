package JavaCore.Java8.Reference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        List<String> students = Arrays.asList("Anshul", "Vividh", "Prasanna");
        students.forEach(MethodReference::print);

        //This work as above, without use of (print) method--> This work as a Consumer
        students.forEach(x -> System.out.println(x));

    }
}
