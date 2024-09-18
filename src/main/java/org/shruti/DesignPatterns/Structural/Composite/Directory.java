package org.shruti.DesignPatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemItem{

    private String name;
    List<FileSystemItem> items = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        items.add(item);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory : " + name);
        for(FileSystemItem item : items) {
            item.showDetails();
        }
    }
}
