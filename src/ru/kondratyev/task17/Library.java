package ru.kondratyev.task17;

import java.io.*;

public class Library implements Serializable {
    public static void main(String args[]) {
        Book book1 = new Book("Винни-Пух", "Милн", "2019");
        Book book2 = new Book("Три медведя", "Толстой", "2018");
        Book book3 = new Book("Красная шапочка", "Шарль Перро", "2017");
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\NewFolder\\library.txt"));
            out.writeObject(book1);
            out.writeObject(book2);
            out.writeObject(book3);
            out.close();
        } catch (IOException e) {
            e.getMessage();
        }
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\NewFolder\\library.txt"));
            Book book11 = (Book) in.readObject();
            Book book22 = (Book) in.readObject();
            Book book33 = (Book) in.readObject();
            book11.print();
            book22.print();
            book33.print();
        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
        }
    }
}
