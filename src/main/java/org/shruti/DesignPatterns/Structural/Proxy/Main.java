package org.shruti.DesignPatterns.Structural.Proxy;

/*
Controls access to an object by acting as its surrogate or placeholder.
The proxy acts as an intermediary between the client and the real object,
providing controlled access to the real object's functionalities.
type : virtual, protection, caching, remote

Subject Interface: This is the common interface implemented by both the real object and the proxy.
Real Object: The actual object to which the proxy refers.
Proxy: Acts as an intermediary between the client and the real object.
 */

public class Main {

    public static void main(String[] args) {

        Image image = new ProxyImage("image.jpg");
        System.out.println("Image created but not loaded yet");

        // Display the image (this will trigger the loading)
        image.display();

        // Displaying the image again (no loading this time)
        image.display();
    }
}
