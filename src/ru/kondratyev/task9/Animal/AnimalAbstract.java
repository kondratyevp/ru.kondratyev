package ru.kondratyev.task9.Animal;

public class AnimalAbstract {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот");
        cat.getName();
        Dog dog = new Dog("Собака");
        dog.getName();
        Duck duck = new Duck("Утка");
        duck.getName();
    }
}