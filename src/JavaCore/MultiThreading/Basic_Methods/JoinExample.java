package JavaCore.MultiThreading.Basic_Methods;

public class JoinExample extends Thread {
    public void run(){
        for (int i=0 ;i<5; i++){
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();
        JoinExample t3 = new JoinExample();
        t1.start();
        try{
            t1.join();   // Join() :  Waits for this thread to die.
        }catch (Exception e){
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}


