package JavaCore.MultiThreading;

// Thread Name

public class Example1 extends Thread{
     public void run(){
         System.out.println(Thread.currentThread().getName());
     }

    public static void main(String[] args) {
        Example1  t1= new Example1();
        Example1  t2 = new Example1();
        t1.start();
        t2.start();

    }
}

//Output: Thread-0
//        Thread-1