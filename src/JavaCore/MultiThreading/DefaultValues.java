package JavaCore.MultiThreading;

public class DefaultValues {
    public static void main(String[] args) {
        System.out.println("Thread Min Priority: "+Thread.MIN_PRIORITY);
        System.out.println("Thread Max Priority: "+Thread.MAX_PRIORITY);
        System.out.println("Thread Normal Priority: "+Thread.NORM_PRIORITY);

        Thread thread = Thread.currentThread();
        System.out.println("Current Thread details: "+thread.currentThread());

        System.out.println("Thread ID: "+thread.getId());
        System.out.println("Thread Name: "+thread.getName());
        System.out.println("Thread Priority: "+thread.getPriority());
        System.out.println("Thread State: "+thread.getState());
        System.out.println("Thread Group: "+thread.getThreadGroup());
        System.out.println("Is Daemon Thread: "+thread.isDaemon());

        thread.setPriority(7);
        System.out.println("After Changing Priority: "+thread.getPriority());
    }
}
