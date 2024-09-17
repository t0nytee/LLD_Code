package org.shruti.DesignPatterns.Creational.AbstractFactory.windows;

import org.shruti.DesignPatterns.Creational.AbstractFactory.Checkbox;

// Concrete product for Windows Checkbox
class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting a Windows checkbox");
    }
}