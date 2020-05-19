package ru.kondratyev.task24;

import java.util.LinkedList;

public class EvenLength {

    private static LinkedList<String> strings;

    public static LinkedList<String> removeEvenLength(LinkedList<String> set) {
        LinkedList<String> removeEvenLength = new LinkedList<>();
        removeEvenLength.addAll(set);
        for (String s : set) {
            if (s.length() % 2 == 0)
                removeEvenLength.remove(s);
        }
        return removeEvenLength;
    }

    @Override
    public String toString() {
        return "EvenLength{" +
                "strings=" + strings +
                '}';
    }

    public static void main(String[] args) {
        strings = new LinkedList<>();
        strings.add("foo");
        strings.add("buzz");
        strings.add("bar");
        strings.add("fork");
        strings.add("bort");
        strings.add("spoon");
        strings.add("!");
        strings.add("dude");
        System.out.println("Первоначальный вариант множества:");
        System.out.println(strings);
        removeEvenLength(strings);
        System.out.println();
        System.out.println("Множество после метода removeEvenLength:");
        System.out.println(removeEvenLength(strings));
    }

}
