package org.shruti.multithreading.Future;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/*
Runnable : doesnot return any type
callable : return type T


case1:
Future<?> submit(Runnable task)

case2:
<T> Future<T> submit(Runnable task, T result)

case3:
<T> Future<T> submit(Callable<T> task)

 */


public class FutureExample {

    public static void main(String[] args) {


        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        executor.allowCoreThreadTimeOut(true);

        Future<?> futureObj = executor.submit(() -> {
                try {
                    Thread.sleep(7000);
                } catch (Exception e) {

                }
                System.out.println("Task processed by " + Thread.currentThread().getName());
            });



        System.out.println("is Done " +  futureObj.isDone());

        try {
            // future.get => calling thread (main) will wait for task to be completed for 2 seconds
            futureObj.get(2, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            System.out.println("Timeout exception");
        } catch (Exception e) {

        }

        try {
            // will wait indefinetly, until task is done
            futureObj.get();
        } catch (Exception e) {

        }

        System.out.println("is done " + futureObj.isDone());
        System.out.println("is cancelled " + futureObj.isCancelled());


        // case 1
        Future<?> futureObj1 = executor.submit(() -> {
            System.out.println("Task processed by " + Thread.currentThread().getName());
        });
        // futureObj1.get() will always be null


        // case 2  pass one type in custom Runnable which will be returned
        Future<Integer> futureObj2 = executor.submit(() -> {
            System.out.println("Task processed by " + Thread.currentThread().getName());
            return 12;
        });
        // futureObj2.get() will return Integer


        //case 3 callable


    }


}

