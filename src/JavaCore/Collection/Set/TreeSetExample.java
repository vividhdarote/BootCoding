package JavaCore.Collection.Set;


import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        System.out.println("-----------Ascending Order -------------");
        SortedSet<Integer> set=new TreeSet<>();

        //1.Adding
        set.add(10);
        set.add(1);
        set.add(23);
        set.add(1);
        set.add(25);
        System.out.println(set);
        //Output: [1, 10, 23, 25]


        //2.Check First and Last
        System.out.println("First Element: "+set.first());  //1
        System.out.println("Last  Element: "+set.last());   //25


        //3.Check by Element
        System.out.println(set.contains(1));  //true


        //4. Remove
        System.out.println(set.remove(25));   //true
        System.out.println(set);
        // Output: [1, 10, 23]


        //5.Subset
        System.out.println("Subset(1,15): "+set.subSet(1,15));
        //Output: Subset(1,15): [1, 10]


        //6. HeadSet and TailSet
        System.out.println(set.headSet(19));
        //Output: [1,10]

        System.out.println(set.tailSet(10));
        //Output: [10,23]




        System.out.println("---------Descending Order ------------");
        TreeSet<Integer> set1 =new TreeSet<>((a,b)->b-a);

        //1.adding
        set1.add(10);
        set1.add(1);
        set1.add(23);
        set1.add(1);
        set1.add(25);

        System.out.println(set1);
        //Output: [25, 23, 10, 1]

        System.out.println("First Element: "+set1.first());   //25
        System.out.println("Last  Element: "+set1.last());    //1

    }
}
