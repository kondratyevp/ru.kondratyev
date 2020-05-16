package ru.kondratyev.task22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PersonSuperComparator {

    public static void main(String[] args) {

        Person person1 = new Person("Dan", 40);
        Person person2 = new Person("Jon", 30);
        Person person3 = new Person("Bob", 20);

        List<Person> persons = new ArrayList<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        Iterator<Person> i = persons.iterator();

        System.out.println("Без сортировки:");
        while (i.hasNext())
            System.out.println(i.next());
        System.out.println();

        System.out.println("Сортировка по имени:");
        Collections.sort(persons);
        for (Person person : persons)
            System.out.println(person);
        System.out.println();

        System.out.println("Сортировка по возрасту:");
        persons.sort(new AgeComparator());
        for (Person person : persons)
            System.out.println(person);
    }

}

