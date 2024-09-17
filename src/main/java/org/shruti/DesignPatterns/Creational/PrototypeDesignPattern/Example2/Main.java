package org.shruti.DesignPatterns.Creational.PrototypeDesignPattern.Example2;


/*
Used to create objects by cloning an existing object, known as the prototype,
rather than instantiating a new object using the new keyword.
This pattern is particularly useful when the cost of creating a new object
is high and an identical or similar object already exists.
 */

public class Main {
    public static void main(String[] args) {
        // Create an original book
        Book originalBook = new Book("The Catcher in the Rye", "J.D. Salinger");

        // Clone the original book
        Book clonedBook = originalBook.clone();

        // Display both original and cloned books
        System.out.println("Original Book: " + originalBook);
        System.out.println("Cloned Book: " + clonedBook);

        // Verify that they are different objects
        System.out.println("Are original and cloned books the same object? " + (originalBook == clonedBook));

        // Modify the cloned book
        clonedBook.setTitle("New Title");

        // Display books again after modification
        System.out.println("Original Book after modification: " + originalBook);
        System.out.println("Cloned Book after modification: " + clonedBook);
    }
}
