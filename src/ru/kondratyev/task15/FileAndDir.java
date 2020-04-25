package ru.kondratyev.task15;

import java.io.File;
import java.io.IOException;

public class FileAndDir {

    static String s = "";

    static File recurs(File f) {
        if (f.isDirectory()) {
            for (File item : f.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(s + item.getName() + " \t folder");
                    s += " ";
                    recurs(item);
                } else {
                    System.out.println(s + item.getName() + "\t file");
                }
                //System.out.println(len);
            }
        }
        return f;
    }

    public static void main(String[] args) {

        File dir1 = new File("D:\\NewFolder");
        File dir2 = new File("D:\\NewFolder\\Folder2");
        File fil1 = new File("D:\\NewFolder", "file1.txt");
        File fil2 = new File(dir1, "file2.txt");
        File fil3 = new File(dir1, "file3.txt");

        boolean b1 = dir1.mkdir();
        boolean b2 = dir2.mkdir();
        try {
            boolean f1 = fil1.createNewFile();
            boolean f3 = fil3.createNewFile();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        boolean f2 = fil1.renameTo(fil2);
        boolean f3 = fil3.delete();

        recurs(dir1);

    }
}


