package JavaCore.MultiThreading.LambdaExpression;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {

        //1.
        // Runnable is an interface class with default abstract method -> public void run()
        //Anonymous interface class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.print("Hello ");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(1000);


        //2.
        // Using Lambda Expression
        // this avoids to write access modifier, variable, return type
        Runnable runnable1 = () -> {
            System.out.print("World ");
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        Thread.sleep(1000);


        //3.
        //Another Lambda Expression example for non-return type -> void()
        // and avoid Curly Braces
        Runnable runnable2 = () -> System.out.print("Its Vividh ");
        Thread thread2 = new Thread(runnable2);
        thread2.start();
        Thread.sleep(1000);


        //4.
        // Directly used method in Thread
        Thread thread3 = new Thread(()-> System.out.println("Here"));
        thread3.start();


        //5.
        Runnable runnable3 = ()->{
            for(int i=0;i<2;i++){
                System.out.println("Its easy");
            }
        };
        Thread thread5 = new Thread(runnable3);
        thread5.start();


        //6.
        Thread thread4 = new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("I Love Java");
            }
        });
        thread4.start();



    }
}