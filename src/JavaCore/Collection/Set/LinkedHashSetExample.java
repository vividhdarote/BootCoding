package JavaCore.Collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        //1.Adding
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        // [10,20,30]

        //2.Adding All
        LinkedHashSet<Integer> moreNumbers = new LinkedHashSet<>();
        moreNumbers.add(40);
        moreNumbers.addAll(numbers);
        moreNumbers.add(10);

        System.out.println(moreNumbers); // [40, 10, 20, 30]

        //Check
        System.out.println(moreNumbers.contains(40));  //true
        System.out.println(moreNumbers.isEmpty());  //false


        //Remove
        moreNumbers.remove(40);
        System.out.println(moreNumbers);
        // [10,20,30]

        moreNumbers.clear();
        System.out.println(moreNumbers);



    }
}
