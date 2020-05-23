package ru.kondratyev.task22;

class Person implements Comparable<Person> {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Person p) {
        return name.compareTo(p.getName());
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "name: " + name +
                ", age: " + age +
                '}';
    }
}


