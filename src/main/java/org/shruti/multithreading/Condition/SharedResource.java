package org.shruti.multithreading.Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


// condition is used for custom locks for inter thread communication like wait and notify functionality in synchronization
//await() - > wait()
//signal() -> notify()
public class SharedResource {
    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void produce() {
        try {
            lock.lock();
            if(isAvailable) {
                System.out.println("producer Thread is waiting " + Thread.currentThread().getName());
                condition.await();
            }
            System.out.println("producer Lock acquired by  " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
            condition.signal();
        } catch (Exception e) {

        } finally {
            lock.unlock();
            System.out.println("producer Lock released by  " + Thread.currentThread().getName());
        }
    }

    public void consume() {

        try {
            Thread.sleep(1000);
            lock.lock();
            System.out.println("Consumer lock acquired by " + Thread.currentThread().getName());
            if(!isAvailable) {
                condition.await();
                System.out.println("Consumer thread is waiting " + Thread.currentThread().getName());
            }
            isAvailable = false;
            condition.signal();
        } catch (Exception e) {

        } finally {
            lock.unlock();
            System.out.println("Consumer lock release by " + Thread.currentThread().getName());
        }
    }

}
