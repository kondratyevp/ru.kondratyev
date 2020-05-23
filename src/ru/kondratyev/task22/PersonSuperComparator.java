package ru.kondratyev.task22;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if (!( p1.getName().equals(p2.getName()) ))
            return p1.getName().compareTo(p2.getName());
        return p1.getAge() - ( p2.getAge() );
    }
}

