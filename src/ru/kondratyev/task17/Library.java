package ru.kondratyev.task17;

import java.io.*;

public class Library {

    public static void openLibrary(String path) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(path);
        ObjectInputStream in = new ObjectInputStream(is);
        Book book;
        while (is.available() > 0) {
            book = (Book) in.readObject();
            System.out.println(book);
        }
    }

    public static ObjectOutputStream writeLibrary(String path) throws IOException {
        return new ObjectOutputStream
                (new FileOutputStream(path));
    }


    public static void main(String[] args) {
        Book book1 = new Book("Винни-Пух", "Милн", "2019");
        Book book2 = new Book("Три медведя", "Толстой", "2018");
        Book book3 = new Book("Красная шапочка", "Шарль Перро", "2016");
        try {
            ObjectOutputStream out = writeLibrary("out" + File.separator + "library.txt");
            out.writeObject(book1);
            out.writeObject(book2);
            out.writeObject(book3);
            out.close();
        } catch (IOException e) {
            e.getMessage();
        }
        try {
            openLibrary("out" + File.separator + "library.txt");
        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
        }
    }
}
