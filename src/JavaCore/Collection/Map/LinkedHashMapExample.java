package JavaCore.Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, false);  //false as default
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 13);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
       /* Output:
        Orange: 10
        Apple: 20
        Guava: 13
       */

        System.out.println("-----------------------------------------------");


        LinkedHashMap<String,Integer> linkedHashMap1=new LinkedHashMap<>(11,03f,true);
        linkedHashMap1.put("Orange", 10);
        linkedHashMap1.put("Apple", 20);
        linkedHashMap1.put("Guava", 13);


        linkedHashMap1.get("Apple");
        linkedHashMap1.get("Orange");
        linkedHashMap1.get("Guava");
        linkedHashMap1.get("Apple");
        linkedHashMap1.get("Orange");
        linkedHashMap1.get("Apple");


        //AccessOrder: true
        //This use to find out the Least Access Item on top

        for (Map.Entry<String, Integer> entry : linkedHashMap1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /*Output:
        Guava: 13
        Orange: 10
        Apple: 20
        */



    }
}
