package JavaCore.Collection.Set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {

        CopyOnWriteArraySet<Integer> copyOnWrite = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListset = new ConcurrentSkipListSet<>();

        for(int i=0;i<5;i++){
            copyOnWrite.add(i+1);
            concurrentSkipListset.add(i+1);
        }

        System.out.println("CopyOnWriteArraySet: "+copyOnWrite);              //[1, 2, 3, 4, 5]
        System.out.println("ConcurrentSkipListSet: "+concurrentSkipListset);  //[1, 2, 3, 4, 5]


        System.out.println("Iterating CopyOnWriteArraySet and Modifying at the same time");
        for(Integer i: copyOnWrite){
            System.out.println("Reading from CopyOnWriteArraySet: " + i);
            // Attempting to modify the set during iteration
            copyOnWrite.add(6);
        }

    /*  Reading from CopyOnWriteArraySet: 1
        Reading from CopyOnWriteArraySet: 2
        Reading from CopyOnWriteArraySet: 3
        Reading from CopyOnWriteArraySet: 4
        Reading from CopyOnWriteArraySet: 5*/



        System.out.println();

        System.out.println("Iterating ConcurrentSkipListSet ad Modifying at the same time");
        for(Integer i: concurrentSkipListset){
            System.out.println("Reading from ConcurrentSkipListSet: " + i);
            // Attempting to modify the set during iteration
            concurrentSkipListset.add(6);
        }

        /*Reading from ConcurrentSkipListSet: 1
        Reading from ConcurrentSkipListSet: 2
        Reading from ConcurrentSkipListSet: 3
        Reading from ConcurrentSkipListSet: 4
        Reading from ConcurrentSkipListSet: 5
        Reading from ConcurrentSkipListSet: 6*/
    }
}
