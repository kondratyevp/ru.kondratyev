package ru.kondratyev.task9.AnimalInterface;

public class AnimalInterface {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот");
        cat.getName();
        cat.getRun();
        Dog dog = new Dog("Собака");
        dog.getName();
        dog.getRun();
        dog.getSwim();
        Duck duck = new Duck("Утка");
        duck.getName();
        duck.getFly();
        duck.getRun();
        duck.getSwim();
    }
}