package JavaCore.Java8.LambdaExpression.Threads_And_Runnable;

public class Example5 {
    public static void main(String[] args) {
        Thread thread4 = new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("I Love Java");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });
        thread4.start();
    }
}
