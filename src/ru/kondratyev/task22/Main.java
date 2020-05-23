package ru.kondratyev.task22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Dan", 50);
        Person person2 = new Person("Jon", 20);
        Person person3 = new Person("Bob", 30);
        Person person4 = new Person("Dan", 40);

        List<Person> persons = new ArrayList<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        System.out.println("Без сортировки:");
        System.out.println(persons);
        System.out.println();

        System.out.println("Сортировка по имени:");
        Collections.sort(persons);
        System.out.println(persons);
        System.out.println();

        System.out.println("Сортировка по имени и по возрасту:");
        persons.sort(new PersonSuperComparator());
        System.out.println(persons);
    }
}


