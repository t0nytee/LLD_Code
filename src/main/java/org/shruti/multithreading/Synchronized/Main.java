package org.shruti.multithreading.Synchronized;


/*
Synchronized block uses a monitor lock which works well when multiple threads uses the same shared resource
object.

When threads use different shared resource object, multiple threads can access critical section simultaneously
which is not desired.
To resolve this scenario we should use custom locks which depend on a lock object shared by all the threads
instead of shared resource object.

custom locks : ReentrantLock, ReadWriteLock, StampedLock, Semaphore

*/

public class Main {

    public static void main(String[] args) {

        SharedResource resource1 = new SharedResource();

        Thread t1 = new Thread(() -> {
            resource1.produce();
        });

        SharedResource resource2 = new SharedResource();

        Thread t2 = new Thread(() -> {
            resource2.produce();
        });


        t1.start();
        t2.start();


    }
}
