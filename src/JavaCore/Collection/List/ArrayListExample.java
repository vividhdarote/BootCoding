package JavaCore.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //1.add
        list.add("Mango");
        list.add("Apple");
        list.add("Pineapple");
        list.add("Orange");
        System.out.println(list);

        //2.add at index value
        list.add(1,"Papaya");
        System.out.println(list);

        //3.replace at index value
        list.set(1,"Berry");
        System.out.println(list);

        //4.access
        System.out.println(list.get(2));

        //5.access with loops
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        for(String i : list){
            System.out.println(i);
        }


        //6.check value existence
        System.out.println(list.contains("Orange"));
        // O/P: Boolean Output

        //7.delete index value
        list.remove(2);
        System.out.println(list);

        //8.delete element
        list.remove(String.valueOf("Orange"));
        System.out.println(list);

        //9.check size
        System.out.println("size: "+list.size());

        //10.Delete the list
        list.clear();
        System.out.println(list);

        //==================================================================
        //Arrays.asList Functionality
        // Return fixed Value
        // We cannot Add
        // But Replaced

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        List<String> list2 = Arrays.asList("Apple", "Banana", "Cheery");

        //access element
        System.out.println(list1.get(1));

        //Replaced
        list1.set(1,"Wednesday");
        System.out.println(list1);

        //if you want to add in (Arrays.asList) format
        //just copy the existing list in new list

        List<String> list3= new ArrayList<>(list2);
        list3.add("mango");
        System.out.println(list2);
        System.out.println(list3);


        //===================================================================
        //Java 9
        //List.Of Functionality
        //Unmodifiable Or cannot replaced

        // create normal List.of
        List<Integer> list4=List.of(1,2,3,4);
        System.out.println(list4);

        //if you want to add in (List.of) format
        //just copy the existing list in new list

        List<Integer> list5=new ArrayList<>();
        list5.add(1);
        list5.add(2);
        list5.add(3);
        list5.add(4);

        List<Integer> list6=List.of(5,6,7);  //unmodify
        list5.addAll(list6);
        System.out.println(list5);


        //=============================================================
        //=============================================================
        //Multi-Threading Un-Synchronization

        ArrayList<Integer> list7 = new ArrayList<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list7.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list7.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();  //join() waits for the thread to die
            t2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of list: " + list7.size());
        // Output: 2000
    }
}
