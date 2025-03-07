package JavaCore.MultiThreading.Synchronization;


//The output of the code is not 2000 because the increment method in the Counter class is not synchronized.
//This results in a race condition when both threads try to increment the count variable concurrently.

//Without synchronization, one thread might read the value of count before the other thread has finished writing its incremented value.
//This can lead to both threads reading the same value, incrementing it, and writing it back, effectively losing one of the increments.

//We can fix this by using synchronized keyword


class Counter {
    private  int count =0;

    public synchronized void  increment(){         //Synchronized keyword used
        count++;
    }

    public int getCount(){
        return count;
    }
}


public class Example1 extends Thread {

    private Counter counter;
    public Example1(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run(){
        for(int i=0 ; i<1000 ; i++){
            counter.increment();
        }
    }

    public static void main(String[] args) {

        Counter counter = new Counter();
        Example1 t1 = new Example1(counter);
        Example1 t2 = new Example1(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception e){}

        System.out.println(counter.getCount());
    }
}
