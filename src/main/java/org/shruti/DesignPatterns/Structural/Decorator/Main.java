package org.shruti.DesignPatterns.Structural.Decorator;

/*
This patterns helps to add more functionality to existing object, without changing its structure.

It’s useful when you want to modify the behavior of an object at runtime,
and you don't want to modify the existing class or use subclassing, which can lead to class explosion.

Component: This is the common interface for both the decorators and the objects that they modify.
ConcreteComponent: This is the original object to which the decorators will add functionalities.
Decorator: This class implements the component interface and has a reference to a component object.
  It is used as a base class for other decorators.
Concrete Decorators: These are classes that extend the functionalities of the component.
 */

public class Main {

    public static void main(String[] args) {
        // Create a plain pizza
        Pizza myPizza = new PlainPizza();

        // Add cheese topping
        myPizza = new Cheese(myPizza);

        // Add olives topping
        myPizza = new Olives(myPizza);

        // Print the description and cost of the pizza
        System.out.println("Description: " + myPizza.getDescription());
        System.out.println("Cost: $" + myPizza.getCost());
    }

}
