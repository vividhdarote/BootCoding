package JavaCore.MultiThreading.Basic_Methods;

//Thread.yield() is a static method that suggests the current thread temporarily pause its execution
//to allow other threads of the same or higher priority to execute.
//It’s important to note that yield() is just a hint to the thread scheduler,
//and the actual behavior may vary depending on the JVM and OS.

public class YieldExample extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" is Running");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YieldExample example = new YieldExample();
        YieldExample example1= new YieldExample();
        example.start();
        example1.start();
    }
}
