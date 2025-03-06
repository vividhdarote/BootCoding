package JavaCore.MultiThreading.Basic_Methods;

//Daemon threads in Java are special threads that run in the background to perform supportive tasks
//(like garbage collection) and do not prevent the JVM from exiting once all non-daemon threads
//(also called user threads) finish execution.


class DaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running...");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) {
        JavaCore.MultiThreading.Basic_Methods.DaemonThread daemonThread = new JavaCore.MultiThreading.Basic_Methods.DaemonThread();
        daemonThread.setDaemon(true); // Setting thread as daemon
        daemonThread.start();

        try {
            Thread.sleep(1000); // Main thread sleeps for 1 seconds
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Main thread ending...");
    }
}