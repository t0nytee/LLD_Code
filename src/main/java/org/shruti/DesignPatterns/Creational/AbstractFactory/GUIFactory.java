package org.shruti.DesignPatterns.Creational.AbstractFactory;

// Abstract factory interface
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}