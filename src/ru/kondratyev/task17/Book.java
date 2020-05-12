package ru.kondratyev.task17;

import java.io.Serializable;

public class Book implements Serializable {
    private final String name;
    private final String author;
    private final String date;

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

    @Override
    public String toString() {
        return "Книга {" +
                "Название: '" + name + '\'' +
                ", автор: '" + author + '\'' +
                ", год издания: '" + date + '\'' +
                '}';
    }
}
