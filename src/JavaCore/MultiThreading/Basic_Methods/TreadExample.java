package JavaCore.MultiThreading.Basic_Methods;

public class TreadExample extends Thread {
    @Override
    public void run(){
        System.out.println("This code is running in the Thread");
    }

    public static void main(String[] args) {
        TreadExample t1 = new TreadExample();
        t1.start();
        System.out.println("System is out of the thread");
    }
}
