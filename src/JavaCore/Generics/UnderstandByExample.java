package JavaCore.Generics;

import java.util.ArrayList;

public class UnderstandByExample {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Hello World");
        list.add(1);
        list.add(2.3);

        System.out.println(list);  //[Hello World, 1, 2.3]

        String s= (String) list.get(0);
        System.out.println(s);   //Hello World

    //  String ss= (String) list.get(1);  //Not showing compile error but shows Run time error because of type safety.

    //  Above code has 3 major issues
        //  1.No Type safety
        //  2.Manual casting
        //  3.No Compile Time checking


    //  These issues can be solved by Generics
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");

        String s1 = list1.get(0);
        String s2 = list1.get(1);

        System.out.println(s1+" "+s2);
    }
}
