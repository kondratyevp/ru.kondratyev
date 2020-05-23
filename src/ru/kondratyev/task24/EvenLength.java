package ru.kondratyev.task24;

import java.util.HashSet;
import java.util.Set;

public class EvenLength {

    private static Set<String> strings;

    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> removeEvenLength = new HashSet<>();
        for (String s : set) {
            if (!( s.length() % 2 == 0 ))
                removeEvenLength.add(s);
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
        EvenLength el = new EvenLength();
        strings = new HashSet<>();
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
        el.removeEvenLength(strings);
        System.out.println();
        System.out.println("Множество после метода removeEvenLength:");
        System.out.println(el.removeEvenLength(strings));
    }

}
