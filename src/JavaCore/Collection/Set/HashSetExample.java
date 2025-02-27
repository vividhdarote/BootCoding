package JavaCore.Collection.Set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class  HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();

        //1.Adding
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67);
        System.out.println(set);
        // Unordered, not allow duplicate // O/P: [1, 67, 12]


        //2.Adds all elements from the given collection.
        List<Integer> list= List.of(1,2,3,4);
        set.addAll(list);
        System.out.println(set);
        //Output: [1, 2, 67, 3, 4, 12]


        //3.Remove
        System.out.println(set.remove(1));  //true
        System.out.println(set);  //Output: [ 2, 67, 3, 4, 12]


        //4.Check
        System.out.println(set.contains(12));  //true


        //5.Intersection
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(12);
        // [2,12,1,3]

        //  [ 2, 67, 3, 4, 12] n [2,12,1,3]
        set.retainAll(set1);
        System.out.println(set);
        //output: [2, 3, 12]


        //6. Difference

        // [2,12,1,3] - [2, 3, 12]
        set1.removeAll(set);
        System.out.println("Difference: " + set1);
        //Output: [1]


        //7.Clear
        set.clear();
        System.out.println(set);

        System.out.println(set.isEmpty());
    }
}
