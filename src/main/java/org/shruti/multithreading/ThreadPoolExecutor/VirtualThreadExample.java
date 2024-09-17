package org.shruti.multithreading.ThreadPoolExecutor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*

virtual thread : Goal is to achieve higher throughput. We can create many virtual threads. A virtual thread will be mapped/linked
to a OS thread only when it is not in IO waiting state and needs CPU processing.
Introduced in jdk19

Normal/platform thread : maintained by jvm and is wrapper around OS thread. Takes time to create a thread => slow. 1:1 mapping of
java thread:os thread. wastes time in IO waiting

 */
public class VirtualThreadExample {

    public static void main(String[] args) {

        // 2 ways to create

        // 1
//        Thread t1 = new Thread().ofVirtual().start(RunnableTask);

        //2
//        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
//        executorService.submit(RunnableTask);

    }
}
