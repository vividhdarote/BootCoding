package JavaCore.Java8.LambdaExpression.Threads_And_Runnable;

public class Default_Use_Of_Runnable {
    public static void main(String[] args) {
        // Runnable is an interface class with default abstract method -> public void run()
        //Anonymous interface class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.print("Hello, Vividh Here");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }
}
