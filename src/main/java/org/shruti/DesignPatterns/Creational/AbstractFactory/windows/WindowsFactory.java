package org.shruti.DesignPatterns.Creational.AbstractFactory.windows;

import org.shruti.DesignPatterns.Creational.AbstractFactory.Button;
import org.shruti.DesignPatterns.Creational.AbstractFactory.Checkbox;
import org.shruti.DesignPatterns.Creational.AbstractFactory.GUIFactory;

// Concrete factory for Windows
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}