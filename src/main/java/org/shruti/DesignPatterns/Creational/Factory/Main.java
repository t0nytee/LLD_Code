package org.shruti.DesignPatterns.Creational.Factory;

/*
Used to to create objects without exposing the exact instantiation logic to the client.
Instead of creating objects directly using the new keyword, a factory class or method is used
to create objects based on input, making the code more flexible and scalable.

Factory: A class or method responsible for creating objects.
Product: The objects that are created by the factory.
Interface/Abstract Class: Often, the factory method returns an object of an interface or abstract class,
 and the actual concrete class is determined at runtime.

 Usage :
When the object creation process is complex.
When you need to decouple the client from the concrete classes it uses.
When the specific class type to instantiate is determined at runtime.

 */

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circleObj = shapeFactory.getShapeInstance("Circle");
        circleObj.computeArea();

    }
}
