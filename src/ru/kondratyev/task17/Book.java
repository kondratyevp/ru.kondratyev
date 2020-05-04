package ru.kondratyev.task17;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String author;
    private String date;

    public Book(String name, String author, String date) {
        this.name = name;
        this.author = author;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public void print() {
        System.out.println("Название: " + getName() + ", Автор: " + getAuthor() + ", Год издания: " + getDate());
    }
}
