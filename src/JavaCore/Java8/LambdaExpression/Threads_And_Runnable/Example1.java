package JavaCore.Java8.LambdaExpression.Threads_And_Runnable;

public class Example1 {
    public static void main(String[] args) {

        // Using Lambda Expression
        // this avoids to write access modifier, variable, return type
        Runnable runnable1 = () -> {
            System.out.print("World ");
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
