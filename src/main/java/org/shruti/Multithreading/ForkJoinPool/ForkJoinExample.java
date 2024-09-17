package org.shruti.Multithreading.ForkJoinPool;

import java.util.concurrent.ForkJoinPool;

/*
The Fork/Join framework is designed for divide-and-conquer algorithms,
where a task is recursively split (forked) into subtasks until they become small enough to be computed directly,
 and then the results are combined (joined).
 Fork: Splitting a task into smaller subtasks that can run concurrently.
Join: Waiting for the results of those subtasks and combining them.
Pool: A pool of worker threads, managed by the ForkJoinPool, which executes tasks in parallel.
 */
/*
Work stealing queue :

A work-stealing queue is a data structure used in multithreaded systems to efficiently distribute tasks among worker threads.
 It allows idle threads to "steal" tasks from other threads' queues, which helps balance the workload and maximize CPU utilization.

 Local Queues: Each worker thread maintains its own queue of tasks called a deque.
 It processes tasks from this queue independently.
  Worker threads push and pop tasks from the bottom of their own deque (LIFO order, Last In First Out).

Work Stealing: When a worker thread finishes its local tasks and becomes idle,
 it attempts to "steal" tasks from the queues of other worker threads.
 This prevents idle threads from wasting CPU resources while other threads are still busy.

When a worker thread needs to steal a task, it steals from the top of another worker thread’s deque (FIFO order, First In First Out).
 */

public class ForkJoinExample {

    public static void main(String[] args) {

        int[] nums = new int[100];
        for(int i=0;i<100;i++) {
            nums[i] = i+1;
        }
        // Create ForkJoinPool
//        ForkJoinPool pool = new ForkJoinPool();

        // uses work-stealing internally)
        ForkJoinPool pool = ForkJoinPool.commonPool();

        // Create the main task
        SumTask maintask = new SumTask(nums, 0, 100);

        int result = pool.invoke(maintask);

        System.out.println(result);

    }
}
