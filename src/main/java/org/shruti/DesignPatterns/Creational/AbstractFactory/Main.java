package org.shruti.DesignPatterns.Creational.AbstractFactory;

import org.shruti.DesignPatterns.Creational.AbstractFactory.mac.MacFactory;
import org.shruti.DesignPatterns.Creational.AbstractFactory.windows.WindowsFactory;

/*
Factory of factory

provides an interface for creating families of related or dependent objects without specifying their concrete classes.
It is an extension of the Factory Method pattern, but whereas a factory method focuses on creating one type of product,
the Abstract Factory pattern creates multiple related products (families of products) that are designed to work together.

Abstract Factory: Declares an interface for creating abstract products.
Concrete Factory: Implements the abstract factory interface to create specific concrete products.
Abstract Product: Declares an interface for a type of product.
Concrete Product: Implements the abstract product interface for specific products.
Client: Uses only the interfaces declared by the abstract factory and abstract product classes.

When to Use:
When the system needs to be independent of how its objects are created, composed, or represented.
When the system needs to support families of related products.
When the system needs to enforce constraints between products (e.g., products created by the same factory are compatible).

eg : Imagine you are building a cross-platform UI toolkit where the interface needs to have buttons and checkboxes.
 You have two families of products: Windows-style buttons and checkboxes and Mac-style buttons and checkboxes.
 */



public class Main {

    public static void main(String[] args) {
        // Select the factory at runtime based on some condition (e.g., OS)
        String osName = "Windows"; // Could be determined dynamically
        GUIFactory factory;

        if (osName.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        // Create the application with the selected factory
        Application app = new Application(factory);
        app.paint();
    }
}
