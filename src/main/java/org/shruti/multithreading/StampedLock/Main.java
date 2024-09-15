package org.shruti.multithreading.StampedLock;

/*
 StampedLokc provides both ReadWrite lock and Optimistic Read functionality.
 It provides a stamp version which can be used to validate if shared resource was updated
 During read stamp version = v1
 while updating check if version is still v1 -> update
 else rollback
*/
public class Main {

    public static void main(String[] args) {

        SharedResource resource1 = new SharedResource();
        Thread t1 = new Thread(() -> {
            resource1.produce();
        });

        Thread t2 = new Thread(() -> {
            resource1.consume();
        });



        t1.start();
        t2.start();
    }
}
