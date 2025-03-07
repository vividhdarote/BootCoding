package JavaCore.MultiThreading.Synchronization;


class Sync{
    synchronized void display(String s){
        System.out.println("L "+s);

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("J");
    }
}

class SyncTest extends Thread{
    String z=" ";
    Sync x;
    Thread t;
    public SyncTest(Sync y, String s){
        x=y;
        z=s;
        t= new Thread(this);
        t.start();
    }

    public void run(){
        x.display(z);
    }
}

public class Example2 {
    public static void main(String[] args) {
        Sync s = new Sync();
        SyncTest t1 = new SyncTest(s,"Hello");
        SyncTest t2 = new SyncTest(s,"Vividh");
        SyncTest t3 = new SyncTest(s,"Good Morning");
    }
}
