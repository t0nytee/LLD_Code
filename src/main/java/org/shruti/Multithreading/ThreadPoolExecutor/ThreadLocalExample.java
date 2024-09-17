package org.shruti.Multithreading.ThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalExample {

    public static void main(String[] args) {

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set(Thread.currentThread().getName());

        Thread t1 = new Thread(() -> {
            threadLocal.set(Thread.currentThread().getName());
        });

        t1.start();

        System.out.println(threadLocal.get());


        ExecutorService poolObj = Executors.newFixedThreadPool(5);

        poolObj.submit(() -> {
           threadLocal.set(Thread.currentThread().getName());
            System.out.println("Thread local set for thread" + Thread.currentThread().getName());
            // do some task
            // clean threadlocalobject
            threadLocal.remove();
        });

        for(int i=0;i<15;i++) {
            poolObj.submit(() -> {
                System.out.println(threadLocal.get());
            });
        }



    }
}
