package org.shruti.Multithreading.Future;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


// CompletableFuture is adanced version of Future which has additional functionality like chaining
public class CompletableFutureExample {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        executor.allowCoreThreadTimeOut(true);

        // supplyAsync

        CompletableFuture<String> asynTask1 = CompletableFuture.supplyAsync(()-> {
            return "Task completed";
        }, executor);

        try {
            System.out.println(asynTask1.get());
        } catch (Exception e) {

        }

        // thenApply = > same thread will continue in synchronous manner
        CompletableFuture<String> asynTask2 = CompletableFuture.supplyAsync(()-> {
            return "Task completed";
        }, executor).thenApply((String val) -> {
           return val + " successfully";
        });

        try {
            System.out.println(asynTask2.get());
        } catch (Exception e) {

        }

        // thenApplyAsync = > it will be done in async manner. Same/or Different thread will pick up this task depending on availability
        CompletableFuture<String> asynTask3 = asynTask2.thenApplyAsync((String val) -> {
            return val + " successfully using async thread";
        });

        try {
            System.out.println(asynTask3.get());
        } catch (Exception e) {

        }

        // thenCompose, thenComposeAsync = > creates ordering of dependent async tasks, order is maintained
        CompletableFuture<String> asynTask4 =
       asynTask3.thenCompose((String val) -> {
          return CompletableFuture.supplyAsync(() -> val + " compose");
       }).thenComposeAsync((String val) -> {
           return CompletableFuture.supplyAsync(() -> val + " again ");
       }).thenCompose((String val) -> {
           return CompletableFuture.supplyAsync(() -> val + "  and again");
       });


        // thenAccept, thenAcceptAsync => end stage for all async tasks
        CompletableFuture<Void> asynTask5 =  asynTask4.thenAccept((String val)-> {
            System.out.println("The end");
        } );

        // thenCombine, thenCombineAsync = > combine result of two CompletableFuture
        CompletableFuture<String> asynTask6 =  CompletableFuture.supplyAsync(() -> {return "K";});
        CompletableFuture<Integer> asynTask7 =  CompletableFuture.supplyAsync(() -> {return 2;});

        CompletableFuture<String> combinedtask = asynTask6.thenCombine(asynTask7, (String v1, Integer v2) -> v1 + v2);
        try {
            System.out.println(combinedtask.get());
        } catch (Exception e) {

        }


    }
}
