package org.shruti.Multithreading.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/* How to decide corePoolSize => initial no. of threads in threadpool, even if it doesnot do anything.
 cpu cores : if no. of cpu core is 2 that means 2 threads can execute parallely in the OS. One on each core. If
 there are more no. of threads created in threadpool, it will spend lot of time in context switching.
 JVM memory : if there are more threads in threadpool, it will waste jvm memory unnecesarily.
 task type : if task is cpu intensive => keep no. of threads low. For IO intensive tasks => no. of threads should be high

 Threadpool min and max size should be fine tuned iteratively

 Max no. of thread = no.of CPU core * (1 + request waiting time/processing time)

*/
public class Main {

    public static void main(String[] args) {

//        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 5, TimeUnit.MINUTES,
//                new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());

        // core
        int core = Runtime.getRuntime().availableProcessors();
        System.out.println("core : "+core);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 1, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2), new CustomThreadFactory(), new CustomRejectHandler());
        executor.allowCoreThreadTimeOut(true);
        for(int i=1;i<=7;i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {

                }
                System.out.println("Task processed by " + Thread.currentThread().getName());
            });
        }


    }


}

class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        return th;
    }
}

class CustomRejectHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task rejected " + executor.toString());
    }
}
