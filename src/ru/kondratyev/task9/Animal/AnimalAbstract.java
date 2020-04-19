package ru.kondratyev.task9.Animal;

public class AnimalAbstract {
    public static void main(String[] args) {
        Animal cat = new Cat("Кот");
        cat.getName();
        Animal dog = new Dog("Собака");
        dog.getName();
        Animal duck = new Duck("Утка");
        duck.getName();
    }
}