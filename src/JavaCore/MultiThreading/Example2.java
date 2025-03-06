package JavaCore.MultiThreading;

//Changing Thread Name

public class Example2  {
    public static void main(String[] args) {
        Thread thread= Thread.currentThread();
        System.out.println("Current Thread: "+thread.getName());
        thread.setName("My Thread");
        System.out.println("After name change: "+thread.getName());
        try{
            for(int i=5 ;i>0;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("Stopped..");
        }
        catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
    }

}
