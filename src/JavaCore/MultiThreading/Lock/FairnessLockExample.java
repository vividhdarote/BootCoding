package JavaCore.MultiThreading.Lock;

// Fairness in the context of locks refers to the order in which threads acquire a lock.
// A fair lock ensures that threads acquire the lock in the order they requested it,
// preventing thread starvation. With a fair lock, if multiple threads are waiting,
// the longest-waiting thread is granted the lock next.
// However,fairness can lead to lower throughput due to the overhead of maintaining the order.
// Non-fair locks, in contrast, allow threads to “cut in line,”
// potentially offering better performance but at the risk of some threads waiting indefinitely if others frequently acquire the lock.



import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class FairnessLockExample {
    private final Lock lock = new ReentrantLock(true);    //Fairness is true

    public void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock.");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLockExample example = new FairnessLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}