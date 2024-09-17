package org.shruti.DesignPatterns.Creational.AbstractFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    // Constructor that accepts a factory
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
