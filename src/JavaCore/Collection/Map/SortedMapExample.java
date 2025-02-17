package JavaCore.Collection.Map;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer,String> map=new TreeMap<>();

        System.out.println("--------------Ascending Order-----------------");

        map.put(91,"Vivek");
        map.put(99,"Shubham");
        map.put(78,"Mohit" );
        map.put(77,"Vipul");

        System.out.println(map);
        //Output: {77=Vipul, 78=Mohit, 91=Vivek, 99=Shubham}

        System.out.println(map.firstKey()); //Output: 77
        System.out.println(map.lastKey());  //Output: 99

        System.out.println(map.headMap(91)); // exclude //toKey
        System.out.println(map.tailMap(91));  //from key

        System.out.println(map.subMap(10,98)); // Output:  {77=Vipul, 78=Mohit, 91=Vivek}

        System.out.println(map.get(77)); //Output: Vipul

        System.out.println(map.containsKey(78));  //Output: true
        System.out.println(map.containsValue(77));  //Output: false


        System.out.println("--------------Decending Order-----------------");

        SortedMap<Integer,String> map1=new TreeMap<>((a,b)->b-a);

        map1.put(91,"Vivek");
        map1.put(99,"Shubham");
        map1.put(78,"Mohit" );
        map1.put(77,"Vipul");

        System.out.println(map1);
        //Output: {99=Shubham, 91=Vivek, 78=Mohit, 77=Vipul}




        //=================NavigableMap=========================

        System.out.println("-----------NavigableMap------------");
        NavigableMap<Integer, String> navigableMap =  new TreeMap<>();

        navigableMap.put(1, "One");
        navigableMap.put(5, "Five");
        navigableMap.put(3, "Three");

        System.out.println(navigableMap);
        //Output: {1=One, 3=Three, 5=Five}

        System.out.println(navigableMap.lowerKey(4));  //Output: 3
        System.out.println(navigableMap.ceilingKey(3));  //Output: 3

        System.out.println(navigableMap.lowerEntry(4));  //Output: 3=Three
        System.out.println(navigableMap.higherEntry(1));  //Output: 3=Three

        System.out.println(navigableMap.descendingMap());
        //Output: {5=Five, 3=Three, 1=One}

    }
}
