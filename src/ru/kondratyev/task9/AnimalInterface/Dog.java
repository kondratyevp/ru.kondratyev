package ru.kondratyev.task9.AnimalInterface;


class Dog extends Animal implements Runnable, Swimmable {

    public Dog(String animal) {
        super(animal);
    }

    public void getName() {
        System.out.println(getAnimal());
    }

    public void Run() {
        System.out.println("Бегает");
    }

    public void Swim() {
        System.out.println("Плавает");
    }
}