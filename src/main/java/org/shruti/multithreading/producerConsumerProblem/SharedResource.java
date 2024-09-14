package org.shruti.multithreading.producerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    int bufferSize;
    public  SharedResource(int s) {
        sharedBuffer = new LinkedList<>();
        this.bufferSize = s;
    }

    public synchronized void produce(int item) throws Exception {
        while(sharedBuffer.size()==bufferSize) {
            System.out.println("Buffer is full, producer is waiting for consumer");
            wait();
        }

        sharedBuffer.add(item);
        System.out.println("Produced item " + item);
        notify();
    }

    public synchronized void consume() throws Exception {
        while (sharedBuffer.isEmpty()) {
            System.out.println("Buffer is empty, consumer is waiting for producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumer item " + item);
        notify();
    }

}
