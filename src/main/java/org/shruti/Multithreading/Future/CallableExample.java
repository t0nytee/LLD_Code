package org.shruti.Multithreading.Future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CallableExample {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        executor.allowCoreThreadTimeOut(true);

        Future<List<Integer>> futureObj3 = executor.submit(() -> {
            List<Integer> output = new ArrayList<>();
            output.add(3);
            System.out.println("Task processed by " + Thread.currentThread().getName());
            return output;
        });

        try {
            // will wait indefinetly, until task is done
            List<Integer> output  = futureObj3.get();
            System.out.println(output.get(0));
        } catch (Exception e) {

        }

    }
}
