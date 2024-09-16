package org.shruti.multithreading.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExamples {

    public static void main(String[] args) {


        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        fixedThreadPool.submit(() -> {
            System.out.println("Hello fixed thread pool");
        });


        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        cachedThreadPool.submit(() -> {
            System.out.println("Hello cached thread pool");
        });

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.submit(() -> {
            System.out.println("Hello single thread pool");
        });


    }
}
