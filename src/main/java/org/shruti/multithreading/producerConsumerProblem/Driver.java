package org.shruti.multithreading.producerConsumerProblem;
public class Driver {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource(3);

        Thread producerThread = new Thread(() -> {
                try {
                    for(int i=1;i<=10;i++) {
                        sharedResource.produce(i);
                    }
                }catch (Exception e) {
                    // exception
                }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                for(int i=1;i<=10;i++) {
                    sharedResource.consume();
                }
            } catch (Exception e) {

            }
        });

        producerThread.start();
        consumerThread.start();

    }
}
