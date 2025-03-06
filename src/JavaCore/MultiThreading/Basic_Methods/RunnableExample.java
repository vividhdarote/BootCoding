package JavaCore.MultiThreading.Basic_Methods;

public class RunnableExample implements Runnable{
    @Override
    public void run(){
        System.out.println("This code is running in the thread");
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableExample t1= new RunnableExample();
        Thread thread = new Thread(t1);
        thread.start();
        thread.join(); // join() use to waiting for termination then execute the remaining code. Write in Try Catch Block or Throws Exception
        System.out.println("System is outside the thread");
    }

}
