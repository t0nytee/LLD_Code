package org.shruti.Multithreading.ForkJoinPool;

import java.util.concurrent.RecursiveTask;

// // RecursiveTask is a special type of task that can return a result.
public class SumTask extends RecursiveTask<Integer> {

    public static final Integer THRESHOLD = 10;
    int[] nums;
    int start;
    int end;

    public SumTask(int[] nums, int s, int e) {
        this.nums = nums;
        this.start = s;
        this.end = e;
    }

    // Compute method (executed by each task)
    @Override
    protected Integer compute() {
        // If the task is small enough, do the computation directly
        if((end-start)<=THRESHOLD) {
            int sum = 0;
            for(int i=start;i<end;i++) {
                sum +=nums[i];
            }
            return sum;
        } else {
            // Otherwise, split the task into two smaller tasks (fork)
            int mid = (start + end)/2;
            SumTask leftTask = new SumTask(nums, start, mid);
            SumTask rightTask = new SumTask(nums, mid, end);

            // Fork the subtasks and join their results
            leftTask.fork(); // Start left task asynchronously
            int rightResult = rightTask.compute(); // Compute right task directly (no need to fork)
            int leftResult = leftTask.join(); // Wait for the left task to finish

            // Combine the results
            return leftResult + rightResult;

        }
    }
}
