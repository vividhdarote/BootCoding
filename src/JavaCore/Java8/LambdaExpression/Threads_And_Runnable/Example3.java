package JavaCore.Java8.LambdaExpression.Threads_And_Runnable;

public class Example3 {
    public static void main(String[] args) {

        // Directly used method in Thread
        Thread thread3 = new Thread(()-> System.out.println("Vividh Here"));
        thread3.start();
    }
}
