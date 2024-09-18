package org.shruti.DesignPatterns.Structural.Composite;

public class File implements FileSystemItem{

    private String name;
    private int size;
    public File(String name, int s) {
        this.name = name;
        this.size = s;
    }

    @Override
    public void showDetails() {
        System.out.println("File : " + name + " size : " + size);
    }
}
