package JavaCore.Collection.Map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map =  new ConcurrentHashMap<>();
        // Java 7 --> segment based locking --> 16 segments --> smaller hashmaps
        // Only the segment being written to or read from is locked
        // read: do not require locking unless there is a write operation happening on the same segment
        // write: lock

        // java 8 --> no segmentation
        //        --> Compare-And-Swap approach --> no locking except resizing or collision
        // Thread A last saw --> x = 45
        // Thread A work --> x to 50
        // if x is still 45, then change it to 50 else don't change and retry
        // put --> index

        // MAP --> SORTED --> THREAD SAFE --> ConcurrentSkipListMap


                // Adding elements
                map.put("One", 1);
                map.put("Two", 2);
                map.put("Three", 3);


                // Retrieving elements
                System.out.println("Value for 'One': " + map.get("One"));
                // Output: Value for 'One': 1


                // Updating elements
                map.put("One", 10); // Overwrites the previous value for "One"
                System.out.println("New value for 'One': " + map.get("One"));
                // Output: New value for 'One': 10


                // Using computeIfAbsent for thread-safe lazy initialization
                map.computeIfAbsent("Four", k -> 4);
                System.out.println("Value for 'Four': " + map.get("Four"));
                // Output: Value for 'Four': 4


                // Using forEach for iteration (thread-safe if no modification)
                map.forEach((key, value) -> System.out.println(key + " : " + value));


                // Size of the map
                System.out.println("Size of map: " + map.size()); // p
               //Output: Size of map: 4


                // Removing an element
                map.remove("Two");
                System.out.println("After removing 'Two': " + map);


                // Thread-safe operations in a multi-threaded environment
                Thread thread1 = new Thread(() -> {
                    for (int i = 5; i < 10; i++) {
                        map.put("Key" + i, i);
                    }
                });

                Thread thread2 = new Thread(() -> {
                    for (int i = 10; i < 15; i++) {
                        map.put("Key" + i, i);
                    }
                });

                thread1.start();
                thread2.start();

                try {
                    thread1.join();
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Final map content:");
                map.forEach((k, v) -> System.out.println(k + " -> " + v));

 /*       Final map content:
        One -> 10
        Four -> 4
        Three -> 3
        Key10 -> 10
        Key11 -> 11
        Key12 -> 12
        Key13 -> 13
        Key14 -> 14
        Key6 -> 6
        Key5 -> 5
        Key9 -> 9
        Key8 -> 8
        Key7 -> 7*/
            }
        }



