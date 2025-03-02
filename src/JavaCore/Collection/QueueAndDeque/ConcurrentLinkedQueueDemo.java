package JavaCore.Collection.QueueAndDeque;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {
    private static ConcurrentLinkedQueue<String> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {
        Thread Producer = new Thread(()->{
            while (true) {
                try {
                    concurrentLinkedQueue.add("Task " + System.currentTimeMillis());
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread Consumer = new Thread(()->{
           while (true){
               try{
                 String task=concurrentLinkedQueue.poll();
                   System.out.println("Processing: "+task);
                   Thread.sleep(1000);
               }
               catch (Exception e){
                   e.printStackTrace();
               }

           }
        });

        Producer.start();
        Consumer.start();

    }
}
