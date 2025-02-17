package JavaCore.Collection.List;


import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        //1.adding element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        //Output: [1, 2, 3, 4]

        //2.add at index value
        list.add(1,20);
        System.out.println(list);
        //Output: [1, 20, 2, 3, 4]

        //3.add at Last (as default)
        //4.add at front
        list.addLast(5);     //Time complexity: O(1)
        list.addFirst(0);    //Time complexity: O(1)
        System.out.println(list);
        //Output: [0, 1, 20, 2, 3, 4, 5]

        //5.replace at index value
        list.set(2,10);
        System.out.println(list);
        //Output: [0, 1, 10, 2, 3, 4, 5]

        //6.access
        System.out.println(list.get(2));
        //Output: 10
        System.out.println(list.getFirst());
        //Output: 0
        System.out.println(list.getLast());
        //Output: 5


        //7.access with for loop
        for(int i : list){
            System.out.println(i);
        }
      /*  Output:
        0
        1
        10
        2
        3
        4
        5
      */

        //8.check value existence
        System.out.println(list.contains(10));
        // O/P: Boolean Output: true

        //9.delete //Time complexity: O(1)
        list.remove(2);
        System.out.println(list);
        //Output: [0, 1, 2, 3, 4, 5]

        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        //OUtput: [1, 2, 3, 4]

        //10.delete First and Last Occurance number
        list.add(2,1);
        list.add(3,4);
        System.out.println(list);
        //output: [1,2,1,4,3,4]

        list.removeFirstOccurrence(1);
        System.out.println(list);
        //output: [2,1,4,3,4]
        list.removeLastOccurrence(4);
        System.out.println(list);
        //output: [2,1,4,3]

        //11.delete list
        list.clear();
        System.out.println(list);
        //Output: []

//==============================================================
        //Java 8 Stream
        //remove with conditions
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        //Output: [1, 2, 3, 4, 5, 6, 7]
        list.removeIf(x-> x%2==0);
        System.out.println(list);
        //Output: [1, 3, 5, 7]

        //======================================================//
        LinkedList<String> animals =new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> animalsToRemove =new LinkedList<>(Arrays.asList("Dog","Lion"));
        System.out.println("Animals:"+animals );
        //Output: Animals:[Cat, Dog, Elephant]

        System.out.println("AnimalsToRemove: "+animalsToRemove);
        //Output:  AnimalsToRemove: [Dog, Lion]

        animals.remove(animalsToRemove);
        System.out.println("After Removing: :"+animals);
        //After Removing: :[Cat, Dog, Elephant]
        //Output
        //Not change because Arrays.asList is unchangeable

        //=============================================================
        //=============================================================

        //Multi-Threading Un-Synchronization


        LinkedList<Integer> list3 = new LinkedList<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list3.push(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list3.push(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of list: " + list3.size());
        // Output: 2000


    }
}
