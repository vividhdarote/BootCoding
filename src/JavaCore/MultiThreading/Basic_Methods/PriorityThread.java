package JavaCore.MultiThreading.Basic_Methods;

public class PriorityThread extends Thread{
    public PriorityThread(String name){
        super(name);
    }

    public void run(){
        System.out.println("Running Thread name: "+Thread.currentThread().getName());
        System.out.println("Running Thread Priority: "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        PriorityThread thread = new PriorityThread("Vividh");
        PriorityThread thread1= new PriorityThread("Anshul");
        PriorityThread thread2= new PriorityThread("Dumri");
        thread.setPriority(Thread.MIN_PRIORITY);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
