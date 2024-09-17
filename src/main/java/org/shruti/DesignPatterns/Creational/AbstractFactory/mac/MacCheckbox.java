package org.shruti.DesignPatterns.Creational.AbstractFactory.mac;

import org.shruti.DesignPatterns.Creational.AbstractFactory.Checkbox;

// Concrete product for Mac Checkbox
class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting a Mac checkbox");
    }
}