package org.shruti.DesignPatterns.Creational.AbstractFactory.mac;

import org.shruti.DesignPatterns.Creational.AbstractFactory.Button;
import org.shruti.DesignPatterns.Creational.AbstractFactory.Checkbox;
import org.shruti.DesignPatterns.Creational.AbstractFactory.GUIFactory;

// Concrete factory for Mac
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
