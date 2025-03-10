package JavaCore.Java8.LambdaExpression.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(6);


        Collections.sort(list,(a,b)-> a - b);   // For Ascending Order   // As Default
        System.out.println(list);

        Collections.sort(list,(a,b)-> b - a);   // For Descending Order
        System.out.println(list);

    }
}
