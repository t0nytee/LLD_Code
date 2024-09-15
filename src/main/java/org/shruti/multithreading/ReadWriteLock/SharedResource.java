package org.shruti.multithreading.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {

    boolean isAvailable = false;

    public void read(ReadWriteLock lock) {
        try {
            lock.readLock().lock();
            System.out.println("Read Lock acquired by  " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        } catch (Exception e) {

        } finally {
            System.out.println("Read Lock released by  " + Thread.currentThread().getName());
            lock.readLock().unlock();
        }
    }

    public void write(ReadWriteLock lock) {
        try {
            lock.writeLock().lock();
            System.out.println("Write Lock acquired by  " + Thread.currentThread().getName());
            isAvailable = false;
            Thread.sleep(5000);
        } catch (Exception e) {

        } finally {
            System.out.println("Write Lock released by  " + Thread.currentThread().getName());
            lock.writeLock().unlock();
        }
    }
}
