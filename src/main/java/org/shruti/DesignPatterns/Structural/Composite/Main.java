package org.shruti.DesignPatterns.Structural.Composite;

/*
This paterns helps in scenarios where we have object inside object (Tree like structure)
Allows you to compose objects into tree-like structures to represent part-whole hierarchies.
eg : File system -> directory or file
Delivery box -> delivery box or item
Component: This is the base interface or abstract class for both leaf nodes and composite nodes.
Leaf: Represents individual objects (which cannot have children).
Composite: Represents complex objects that can have children (other leaf or composite objects).
 */

public class Main {

    public static void main(String[] args) {

        File file1 = new File("text1.txt", 2);
        File file2 = new File("text2.txt", 2);
        File file3 = new File("text3.txt", 2);

        Directory root = new Directory("Root");
        Directory home = new Directory("Home");
        Directory music = new Directory("Music");

        root.add(file1);
        root.add(home);
        home.add(music);
        home.add(file2);
        home.add(file3);

        root.showDetails();
    }
}
