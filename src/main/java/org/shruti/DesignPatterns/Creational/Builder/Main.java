package org.shruti.DesignPatterns.Creational.Builder;

/*
Builds object step by step
Provides a way to construct complex objects step-by-step.
Unlike the Factory pattern, which creates objects in one go,
the Builder pattern separates the construction of a complex object from its representation.

Key Concepts:
Builder: An abstract class or interface that defines the steps required to build a product.
Concrete Builder: A class that implements the Builder interface to construct and assemble the parts of the product.
Product: The complex object that is being constructed.
Director: A class that constructs an object using the Builder interface. It defines the order in which to execute the building steps.

When to Use:
When the construction process of an object is complex.
When you need to create different representations of the same type of object.
When you want to control the construction process and allow different combinations of components.
 */

public class Main {

    public static void main(String[] args) {
        Director director = new Director(new FlatBuilder());
        House house = director.constructHouse();
        System.out.println(house);
    }
}
