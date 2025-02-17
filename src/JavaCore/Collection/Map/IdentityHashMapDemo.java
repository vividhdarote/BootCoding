package JavaCore.Collection.Map;


import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new IdentityHashMap<>();
        String key1 = new String("Akshit");
        String key2 = new String("Akshit");
        map.put(key1, 90);
        map.put(key2, 92);
        System.out.println(System.identityHashCode(key1));  //1791741888
        System.out.println(System.identityHashCode(key2));  //1595428806
        System.out.println(key1.hashCode());  //1963240842
        System.out.println(key2.hashCode());  //1963240842

        System.out.println(map);
        //Output: {Akshit=90, Akshit=92}

    }
}
