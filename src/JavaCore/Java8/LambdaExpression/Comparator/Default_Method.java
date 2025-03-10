package JavaCore.Java8.LambdaExpression.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyClass implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;   //for descending order
    }
}
public class Default_Method{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(6);

        Collections.sort(list);   //Ascending Order
        System.out.println(list);

        MyClass myClass = new MyClass();
        Collections.sort(list,myClass);     //Its also can be written as:  // Collection.sort(list, new MyClass())
        System.out.println(list);


    }
}
