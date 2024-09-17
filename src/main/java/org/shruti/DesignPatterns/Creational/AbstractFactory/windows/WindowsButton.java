package org.shruti.DesignPatterns.Creational.AbstractFactory.windows;

import org.shruti.DesignPatterns.Creational.AbstractFactory.Button;

// Concrete product for Windows Button
class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a Windows button");
    }
}