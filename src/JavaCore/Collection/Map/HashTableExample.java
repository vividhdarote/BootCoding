package JavaCore.Collection.Map;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {

        // Hashtable is synchronized
        // no null key or value
        // Legacy Class, ConcurrentHashMap
        // slower than HashMap
        // only linked list in case of collision
        //  all methods are synchronized


        Hashtable<Integer,String> hashtable=new Hashtable<>();

        //1.Adding
        hashtable.put(1,"Vividh");
        hashtable.put(2,"Anshul");
        hashtable.put(3,"Harsh");
        System.out.println(hashtable);
        //Output: {3=Harsh, 2=Anshul, 1=Vividh}


        //2.get
        System.out.println(hashtable.get(1));
        //Output: Vividh

        //3. ContainsKey
        System.out.println(hashtable.containsKey(3));
        //Output: true

        //4. Remove
        hashtable.remove(3);
        System.out.println(hashtable);
        //Output: {2=Anshul, 1=Vividh}



        //hashtable.put(null, "value"); // Throws exception
        //hashtable.put(4, null);   // Throws exception


        Hashtable<Integer,String> map = new Hashtable<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final size of HashMap: " + map.size());

    }
}
