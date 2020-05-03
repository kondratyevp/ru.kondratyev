package ru.kondratyev.task15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.exists;

public class FileAndDir {

    private static String getSpaces(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    static void printContent(File f, int depth) {
        if (f.isDirectory()) {
            for (File item : f.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(getSpaces(depth) + item.getName());
                    printContent(item, depth + 1);
                } else {
                    System.out.println(getSpaces(depth) + item.getName());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        File dir1 = new File("D:\\NewFolder");
        File dir2 = new File("D:\\NewFolder\\Folder2");
        File file1 = new File("D:\\NewFolder", "file1.txt");
        File file2 = new File(dir1, "file2.txt");
        File file3 = new File(dir1, "file3.txt");

        if (!exists(Paths.get("D:\\NewFolder\\path.txt"))) {
            Path path1 = Files.createFile(Paths.get("D:\\NewFolder\\path.txt"));
        }
        boolean b1 = dir1.mkdir();
        boolean b2 = dir2.mkdir();
        try {
            boolean f1 = file1.createNewFile();
            boolean f3 = file3.createNewFile();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        boolean f2 = file1.renameTo(file2);
        boolean f3 = file3.delete();

        printContent(dir1, 0);

    }
}


