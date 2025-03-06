package JavaCore.MultiThreading;

// Pausing
public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Hello ");
        Thread.sleep(1000);
        System.out.print("From ");
        Thread.sleep(1000);
        System.out.print("Java");
    }
}
