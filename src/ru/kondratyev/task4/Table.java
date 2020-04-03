package ru.kondratyev.task4;

public class Table {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "";
        for (int y = 1; y < 10; y++) {
            StringBuilder s = new StringBuilder();
            for (int x = 1; x < 10; x++) {
                s1 = x + "*" + y + "=" + x * y;
                s2 = String.format("%-8s", s1);
                s.append(s2).append(" ");
            }
            System.out.println(s);
        }
    }
}
