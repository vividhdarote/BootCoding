package JavaCore.Collection.QueueAndDeque;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronizedQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<String> queue=new SynchronousQueue<>();
        // each insert operation must wait for a corresponding remove operation by another thread and vice versa.
        // it cannot store elements, capacity of at most one element

        Thread producer = new Thread(()->{
           try {
               System.out.println("Producer is waiting to transfer...");
               queue.put("Hello from producer!");
               System.out.println("Producer has transferred the message.");
           }
           catch (InterruptedException e){
               Thread.currentThread().interrupt();
               System.err.println("Prouducer was interrupt");
           }
        });

        Thread consumer = new Thread(()->{
            try{
                System.out.println("Consumer is waiting for receive...");
                String message= queue.take();
                System.out.println("Consumer receive: "+message);
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.err.println("Consumer was interrupt");
            }
        });

        producer.start();
        consumer.start();
    }
}
