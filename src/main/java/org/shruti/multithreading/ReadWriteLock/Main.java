package org.shruti.multithreading.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();

        SharedResource resource1 = new SharedResource();
        Thread t1 = new Thread(() -> {
            resource1.read(lock);
        });

        Thread t2 = new Thread(() -> {
            resource1.read(lock);
        });

        SharedResource resource2 = new SharedResource();
        Thread t3 = new Thread(() -> {
            resource2.write(lock);
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
