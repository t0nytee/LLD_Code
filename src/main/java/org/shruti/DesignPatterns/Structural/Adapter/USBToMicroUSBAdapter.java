package org.shruti.DesignPatterns.Structural.Adapter;

// Adapter class
public class USBToMicroUSBAdapter implements MicroUSB{

    USB usbDevice;

    public USBToMicroUSBAdapter(USB usbDevice) {
        this.usbDevice = usbDevice;
    }

    @Override
    public void connectWithMicroUSB() {
        System.out.println("Adapter converts microusb to usb");
        usbDevice.connectWithUSB();
    }
}
