package JavaCore.Java8.LambdaExpression.Threads_And_Runnable;

public class Example4 {
    public static void main(String[] args) {
        Runnable runnable3 = ()->{
            for(int i=0;i<2;i++){
                System.out.println("Its easy");
            }
        };
        Thread thread5 = new Thread(runnable3);
        thread5.start();
    }
}
