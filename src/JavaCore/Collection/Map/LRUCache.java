package JavaCore.Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;

    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V>eldest){
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUCache<String,Integer> map= new LRUCache<>(3);
        map.put("Shubham",99);
        map.put("Om",100);
        map.put("Anshul",98);
        System.out.println(map);
       //Output: {Shubham=99, Om=100, Anshul=98}

        map.put("Harsh",90);
        System.out.println(map);
        //Output: {Om=100, Anshul=98, Harsh=90}



    }
}
