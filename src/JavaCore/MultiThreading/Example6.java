package JavaCore.MultiThreading;

public class Example6 extends  Thread{
    String msg;
    public Example6(String msg){
        this.msg=msg;
        start();
    }
    public void run(){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Example6 t1 = new Example6("Vividh");
        Example6 t2 = new Example6("Anshul");
    }
}
