package JavaCore.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class  HashMapExample {
    public static void main(String[] args) {
        HashMap <Integer,String> map = new HashMap<>();

        //1.Adding
        map.put(1,"Om");
        map.put(2,"Ansh");
        map.put(3,"Sahil");
        System.out.println(map);
        //Output: {1=Om, 2=Ansh, 3=Sahil}



        //2.Access (access by key value, Not by index) (unordered) (un synchronized)
        System.out.println(map.get(3));
        //Output: Sahil



        //3.Check Or Contains
        System.out.println("Contains by Key: "+map.containsKey(2));  //Output: true
        System.out.println("Contains by Value: "+map.containsKey("Anshul"));  //Output: false



        //4.Get Value
        Set<Integer>key=map.keySet();
        for(int i: key){
            System.out.println(map.get(i));
        }
        /* Output: Om
                   Ansh
                   Sahil
        */



        //5. Get Value Directly by KeySet
        for(int i: map.keySet()){
            System.out.println(map.get(i));
        }
         /* Output: Om
                    Ansh
                    Sahil
        */



        //6. Get Key and Value
        // Type ( map.entrySet()) then hit alt+enter in Intellij Idea
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> i : entries) {
            System.out.println( i.getKey()+ " : "+i.getValue());
        }
       /* Output:
        1 : Om
        2 : Ansh
        3 : Sahil
       */


        // Or
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        /* Output:
        1 : Om
        2 : Ansh
        3 : Sahil
       */




        //7.Set
        for(Map.Entry<Integer,String> entry1: map.entrySet()){
            entry1.setValue(entry1.getValue().toUpperCase());
        }
        System.out.println("UpperCase: "+map);
        //Output: UpperCase: {1=OM, 2=ANSH, 3=SAHIL}




        //8. Set the value at any existing Key (Replacing)
        map.put(2,"Anshul");
        System.out.println(map);
        //Output: {1=OM, 2=Anshul, 3=SAHIL}




        //9. Remove Item
        map.remove(3);
        System.out.println(map);
        //Output: {1=OM, 2=Anshul}



        //10.Check For Removal of Item
        Boolean res=map.remove(2,"Anshul");
        System.out.println("Remove: "+res);
        //Output: Remove : true



        //11. Delete Map
        map.clear();
        System.out.println(map);
        //Output: {}


        //12.GetOrDefault Method
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Shubham", 91);
        hashMap.put("Bob", 80);
        hashMap.put("Akshit", 78);

        Integer res1 = hashMap.getOrDefault("Shubham", 0);
        System.out.println(res1);
        //Output: 91

        Integer res2 = hashMap.getOrDefault("Vipul",0);
        System.out.println(res2);
        //Output: 0


        //13. PutIfAbsent Method
        Integer res3= hashMap.putIfAbsent("Vipul",99);
        System.out.println(hashMap);
        //Output: {Bob=80, Vipul=99, Shubham=91, Akshit=78}

    }
}
