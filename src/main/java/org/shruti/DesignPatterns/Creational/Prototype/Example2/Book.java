package org.shruti.DesignPatterns.Creational.Prototype.Example2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Book implements Cloneable {
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Override the clone method from Cloneable interface
    @Override
    public Book clone() {
        try {
            return (Book) super.clone(); // Create a shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }
}
