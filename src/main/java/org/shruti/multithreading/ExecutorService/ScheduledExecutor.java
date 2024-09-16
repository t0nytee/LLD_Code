package org.shruti.multithreading.ExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {

    public static void main(String[] args) {
        // min thread pool size = 5
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);

        // Runnable is passed
        executorService.schedule(() -> {
            System.out.println("Hello");
        }, 1, TimeUnit.SECONDS);

        // callable
        Future<String> futureObj = executorService.schedule(() -> {
            return "World";
        }, 1, TimeUnit.SECONDS);

        try {
            System.out.println(futureObj.get());
        } catch (Exception e) {

        }

        ScheduledExecutorService executorService2 = Executors.newScheduledThreadPool(5);

        // new task will start at a fix rate. Eg x, x+d, x+2d, x+3d .......
       Future<?> futureObj2 =  executorService2.scheduleAtFixedRate(() -> {
            System.out.println("Shruti");
        }, 1,3, TimeUnit.SECONDS);

       try {
                Thread.sleep(10000);
                futureObj2.cancel(true);
       } catch (Exception e) {

       }

       // next task will start 2 sec delay after first task has completed
       executorService2.scheduleWithFixedDelay(()-> {
           System.out.println("Hello");
       },1, 2, TimeUnit.SECONDS);

    }
}
