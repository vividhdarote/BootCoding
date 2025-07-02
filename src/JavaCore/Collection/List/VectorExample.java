package JavaCore.Collection.List;


import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();


        //1.adding element
        list.add("Vividh");
        list.add("Sharukh");
        list.add("Kumar");
        list.add("Abhijeet");
        list.add("Anagha");
        list.add("Sakshi");
        System.out.println(list);
        //Output:[Vividh, Sharukh, Kumar, Abhijeet, Anagha, Sakshi]

        //2.add at index value
        list.add(1, "Anshul");
        System.out.println(list);
        //Output:[Vividh, Anshul, Sharukh, Kumar, Abhijeet, Anagha, Sakshi]

        //3.add at Last (as default)
        //4.add at front
        list.addLast("Donald");
        list.addFirst("Gajju");
        System.out.println(list);
        //Output:[Gajju, Vividh, Anshul, Sharukh, Kumar, Abhijeet, Anagha, Sakshi, Donald]

        //5.replace at index value
        list.set(8, "Harsh");
        System.out.println(list);
        //Output:[Gajju, Vividh, Anshul, Sharukh, Kumar, Abhijeet, Anagha, Sakshi, Harsh]

        //6.access
        System.out.println(list.get(3));
        //Output:Sharukh
        System.out.println(list.getLast());
        //Output:Harsh
        System.out.println(list.getFirst());
        //Output:Gajju

        //7.access by for loop
        for (String x : list) {
            System.out.println(x);
        }
     /*   Output:
                Gajju
                Vividh
                Anshul
                Sharukh
                Kumar
                Abhijeet
                Anagha
                Sakshi
                Harsh
*/

        //8.check value existence
        System.out.println("Is 'Vividh' Available: " + list.contains("Vividh"));
        //Output:Is 'Vividh' Available: true

        //9.remove by Value
        list.remove("Sakshi");
        System.out.println(list);
        //Output: [Gajju, Vividh, Anshul, Sharukh, Kumar, Abhijeet, Anagha, Harsh]

        //10.remove by index
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        System.out.println(list);
        //Output:[Vividh, Sharukh, Kumar, Abhijeet, Anagha]

        //11.remove the list
        list.clear();
        System.out.println(list);
        //Output:[]

        //12.We can check the initial capacity of Vector unliked ArrayList and LinkedList
        //Dynamic size increase by 2times (2x)
        Vector<Integer> list1 = new Vector<>(11);
        System.out.println("Capacity:" + list1.capacity());
        //Capacity:11


        Vector<Integer> list2 = new Vector<>(5, 3);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        System.out.println("Capacity:" + list2.capacity());
        //Capacity:5

        list2.add(1);
        System.out.println(list2.capacity());
        //Capacity:8

        list2.add(1);
        list2.add(1);
        System.out.println(list2.capacity());
        //Capacity:8

        list2.add(1);
        System.out.println(list2.capacity());
        //Capacity:11
        //=============================================================
        //=============================================================

        //Multi-Threading Synchronization unliked ArrayList LinkedList

        Vector<Integer> list3 = new Vector<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list3.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list3.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of list: " + list3.size());
        // Output: 2000


    }
}
