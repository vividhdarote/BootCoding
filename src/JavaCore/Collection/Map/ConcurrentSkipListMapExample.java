package JavaCore.Collection.Map;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String,Integer> map=new ConcurrentSkipListMap<>();

        //Probabilistic data structure that allow for efficient search insertion, and deletion operation

        //It is similar to sorted LinkedList but with multiple layers that "Skip" over portion of the list to provide faster access to element

        //Sorted
        //Layer
        //faster access

        // Layer1: 1,2,3,4,5,6,7,8,9
        // Layer2: 1-3-5-7-9
        // Layer3: 1---5---9


    }
}
