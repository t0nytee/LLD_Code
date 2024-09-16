package org.shruti.multithreading.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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

        singleThreadExecutor.shutdown();
// Threadpool executor will stop accepting new task in submission queue, but will continue to process existing tasks

        try{
            // calling thread(main thread) will wait for 2 seconds after calling the shutdown
            // called after executor.shutdown()
            boolean isShutdown = singleThreadExecutor.awaitTermination(2, TimeUnit.SECONDS);
        } catch (Exception e) {

        }

        fixedThreadPool.shutdownNow();
        // shutdownnow => stops/interrupts the actively executing task
        //halts the waiting tasks
        // returns list of task awaiting execution



    }
}
