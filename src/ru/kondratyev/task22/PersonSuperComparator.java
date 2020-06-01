package ru.kondratyev.task22;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        final int i = p1.getName().compareTo(p2.getName());
        if (i != 0) return i;
        return p1.getAge() - p2.getAge();
    }
}


