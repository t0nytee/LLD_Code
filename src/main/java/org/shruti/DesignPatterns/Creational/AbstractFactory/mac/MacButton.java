package org.shruti.DesignPatterns.Creational.AbstractFactory.mac;

import org.shruti.DesignPatterns.Creational.AbstractFactory.Button;

// Concrete product for Mac Button
class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a Mac button");
    }
}