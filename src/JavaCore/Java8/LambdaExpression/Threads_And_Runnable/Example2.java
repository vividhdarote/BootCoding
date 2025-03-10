package JavaCore.Java8.LambdaExpression.Threads_And_Runnable;

public class Example2 {
    public static void main(String[] args) {

        //Another Lambda Expression example for non-return type -> void()
        // and avoid Curly Braces
        Runnable runnable2 = () -> System.out.print("Its Vividh ");
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
