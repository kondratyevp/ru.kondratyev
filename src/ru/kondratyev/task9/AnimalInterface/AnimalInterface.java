package ru.kondratyev.task9.AnimalInterface;

public class AnimalInterface {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот");
        cat.getName();
        cat.Run();
        Dog dog = new Dog("Собака");
        dog.getName();
        dog.Run();
        dog.Swim();
        Duck duck = new Duck("Утка");
        duck.getName();
        duck.Fly();
        duck.Run();
        duck.Swim();
    }
}