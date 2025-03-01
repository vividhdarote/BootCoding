package JavaCore.Collection.QueueAndDeque;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // part of the Queue interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customised ordering
        // does not allow null elements

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //1.Adding
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq);  //[5,10,30,15]   //not sorted

        while(!pq.isEmpty()){
            System.out.println("Remove: "+pq.poll());
        }
  /*
        Remove: 5
        Remove: 10
        Remove: 15
        Remove: 30*/


        // Descending Order
        PriorityQueue<Integer> pq1 = new PriorityQueue<>((x,y)->y-x);

        pq1.add(15);
        pq1.add(10);
        pq1.add(30);
        pq1.add(5);
        System.out.println(pq1);  //[30,10,15,5]   //not sorted

        while(!pq1.isEmpty()){
            System.out.println("Remove: "+pq1.poll());
        }

    /*    Remove: 30
        Remove: 15
        Remove: 10
        Remove: 5
*/
    }
}

// internal working
// PriorityQueue is implemented as a min-heap by default (for natural ordering)
// Min-Heap: Parent node is less than or equal to Child Node
// https://www.cs.usfca.edu/~galles/visualization/Heap.html