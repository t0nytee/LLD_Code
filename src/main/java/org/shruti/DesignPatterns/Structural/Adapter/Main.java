package org.shruti.DesignPatterns.Structural.Adapter;

/*
The Adapter Design Pattern is a structural design pattern that allows incompatible interfaces to work together.
 It acts as a bridge between two incompatible interfaces or classes, enabling them to interact.

Target Interface: This defines the domain-specific interface that the client uses.
Adaptee: The class that has an existing interface but needs to be adapted to work with the target interface.
Adapter: This implements the target interface and internally delegates the requests to the adaptee.

Eg 1 : Imagine you have a phone charger plug (adaptee) that doesn't fit into a wall socket (target interface).
You use an adapter that allows the charger to connect to the socket.

Eg 2 :
Let's assume we have an existing class USB (adaptee) that needs to work with a MicroUSB interface (target interface).
 We can use an adapter to make this work.

 */
public class Main {

    public static void main(String[] args) {
        USB usb = new USB();
        USBToMicroUSBAdapter adapter = new USBToMicroUSBAdapter(usb);
        adapter.connectWithMicroUSB();

    }
}
