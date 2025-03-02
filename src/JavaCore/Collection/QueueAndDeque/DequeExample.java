package JavaCore.Collection.QueueAndDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        // faster iteration, low memory, no null allowed
        // circular, head and tail
        // no need to shift elements, just shift head and tail

        //Adding
        deque.add(10);
        deque.addFirst(9);
        deque.addLast(15);

        deque.offerFirst(1);
        deque.offerLast(11);

        System.out.println(deque);
        //Output: [1, 9, 10, 15, 11]


        //Checking
        System.out.println("First Element: " + deque.getFirst()); // Outputs 1
        System.out.println("Last Element: " + deque.getLast());   // Outputs 11


        //Removing
        deque.removeFirst(); // Removes 1
        deque.pollLast();    // Removes 11

        for(int x: deque) {
            System.out.println(x);
        }
        //Output: [9,10,15]



        Deque<Integer> deque2 = new LinkedList<>();
        // insertion, deletion somewhere in middle
    }
}
