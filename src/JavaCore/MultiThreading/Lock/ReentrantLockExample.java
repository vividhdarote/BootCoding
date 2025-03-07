package JavaCore.MultiThreading.Lock;

//A Reentrant Lock in Java is a type of lock that allows a thread to acquire the same lock multiple times without causing a deadlock.
//If a thread already holds the lock, it can re-enter the lock without being blocked.
//This is useful when a thread needs to repeatedly enter synchronized blocks or methods within the same execution flow.
//The ReentrantLock class from the java.util.concurrent.locks package provides this functionality,
//offering more flexibility than the synchronized keyword, including try-locking, timed locking,
//and multiple condition variables for advanced thread coordination.
/*
//Methods
      lock():
        Acquires the lock, blocking the current thread until the lock is available.
        It would block the thread until the lock becomes available, potentially leading to situations where a thread waits indefinitely.
        If the lock is already held by another thread, the current thread will wait until it can acquire the lock.

      tryLock():
        Tries to acquire the lock without waiting. Returns true if the lock was acquired, false otherwise.
        This is non-blocking, meaning the thread will not wait if the lock is not available.

      tryLock(long timeout, TimeUnit unit):
        Attempts to acquire the lock, but with a timeout. If the lock is not available,
        the thread waits for the specified time before giving up.
        It is used when you want to attempt to acquire the lock without waiting indefinitely.
        It allows the thread to proceed with other work if the lock isn't available within the specified time.
        This approach is useful to avoid deadlock scenarios and when you don't want a thread to block forever waiting for a lock.
        Returns true if the lock was acquired within the timeout, false otherwise.

      unlock():
        Releases the lock held by the current thread.
        Must be called in a finally block to ensure that the lock is always released even if an exception occurs.

      lockInterruptibly():
        Acquires the lock unless the current thread is interrupted. This is useful when you want to handle interruptions while acquiring a lock.
*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("Outer method");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner method");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample t1 = new ReentrantLockExample();
        t1.outerMethod();
    }

}
