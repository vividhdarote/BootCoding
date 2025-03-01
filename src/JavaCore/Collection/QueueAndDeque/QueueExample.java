package JavaCore.Collection.QueueAndDeque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        //1.Adding
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue: "+queue);   //[1,2,3]


        //2.Removing
        System.out.println("Removing: "+queue.remove());  // 1 //throws exception if empty
        System.out.println("Updated Queue: "+queue);      //[2,3]

        System.out.println("Removing: "+queue.poll());    //Removing element from front
        //Output: Removing: 2
        System.out.println("Updated Queue: "+queue);    //[3]

        //3.Peek
        System.out.println("Peeking: "+queue.element()); //3  //throws exception if empty
        System.out.println("Peeking: "+queue.peek());    //3


        //4. Adding using offer
        Queue<Integer> queue1 = new ArrayBlockingQueue<>(2);
        System.out.println(queue1.add(1));        //true
        System.out.println(queue1.offer(2));   //true

        //  System.out.println(queue1.add(3));        //throw exception: IllegalStateException: Queue full
        System.out.println(queue1.offer(3));   //false
    }
}
