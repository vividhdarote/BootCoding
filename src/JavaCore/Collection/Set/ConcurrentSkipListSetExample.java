package JavaCore.Collection.Set;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetExample {
    public static void main(String[] args) {
        // for thread safety
        //  this implements NavigableSet extends SortedSet
        Set<Integer> set1 =  new ConcurrentSkipListSet<>();

        // unmodifiable
        // unordered
        Set<Integer> integers = Set.of(1, 2, 3,4,5,6,7,8,9,54,4323,545,4545);
        // integers.add(111);   //throws an error
        System.out.println(integers);



        //========================================================
        ConcurrentSkipListSet<Integer> concurrentSkipListSet =new ConcurrentSkipListSet<>();

        for(int i=0;i<5;i++){
            concurrentSkipListSet.add(i+1);
        }


        System.out.println("Iterating and Modify at the same time ");
        for (Integer i: concurrentSkipListSet){
            if(i==4){
                concurrentSkipListSet.add(6);
            }

            //We call ConcurrentSkipListSet: Weakly Consistent
            //Because it print the last added element while iterating and printing
            System.out.println("ConcurrentSkipListSet: "+i);
        }
    }
}
