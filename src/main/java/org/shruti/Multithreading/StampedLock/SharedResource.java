package org.shruti.Multithreading.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {

    int a = 10;

    StampedLock lock = new StampedLock();

    public void produce() {
        try {
            long stamp = lock.tryOptimisticRead();
            System.out.println("Try optimistic read  " + Thread.currentThread().getName());
            Thread.sleep(5000);
            if(lock.validate(stamp)) {
                a = 11;
                System.out.println("Updated a value successfully by producer");
            } else {
                a = 10;
                System.out.println("Rollback");
            }
        } catch (Exception e) {

        }
    }

    public void consume() {
        long stamp = lock.writeLock();
        System.out.println("Write Lock acquired by  " + Thread.currentThread().getName());
        try {

            a= 9;
            System.out.println("Value updated by consumer");
            Thread.sleep(5000);
        } catch (Exception e) {

        } finally {
            System.out.println("Write Lock released by  " + Thread.currentThread().getName());
            lock.unlockWrite(stamp);
        }
    }
}
