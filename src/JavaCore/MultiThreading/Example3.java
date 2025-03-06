package JavaCore.MultiThreading;

// Checking Thread is Daemon or not

public class Example3 extends Thread{

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread work");
        }
        else {
            System.out.println("User thread work");
        }
    }
    public static void main(String[] args) {
        Example3 t1 = new Example3();
        Example3 t2 = new Example3();
        Example3 t3= new Example3();

        t1.setDaemon(true);
        t2.setDaemon(false);

        t1.start();
        t2.start();
        t3.start();
    }
}
