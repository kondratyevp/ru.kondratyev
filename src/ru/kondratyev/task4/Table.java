package ru.kondratyev.task4;

public class Table {
    public static void main(String[] args) {
        int x;
        int y = 1;
        String s = "", s1 = "", s2 = "";
        for (y = 1; y < 10; y++) {
            s = "";
            for (x = 1; x < 10; x++) {
                s1 = x + "*" + y + "=" + x * y + "   ";
                s2 = s1.substring(0, 7);
                s = s + s2 + " ";
            }
            System.out.println(s);
        }
    }
}
