package JavaCore.MultiThreading.Basic_Methods;


// sleep() method is used to pause the execution of the current thread for a specified period of time.
public class SleepExample extends Thread {
    @Override
    public void run(){
        for(int i=0;i<=5; i++){
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }   // Cannot throw Exception in the run() method because it is overriding method, use Try Catch Block

    public static void main(String[] args) {
        SleepExample t1 = new SleepExample();
        SleepExample t2 = new SleepExample();
        t1.start();
        t2.start();
        // t1.start();  If you try to start thread twice, its throws an error
    }

}
