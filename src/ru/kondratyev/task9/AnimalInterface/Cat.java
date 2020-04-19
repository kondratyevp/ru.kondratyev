package ru.kondratyev.task9.AnimalInterface;


class Cat extends Animal implements Runnable {

    public Cat(String animal) {
        super(animal);
    }

    public void getName() {
        System.out.println(getAnimal());
    }

    public void Run() {
        System.out.println("Бегает");
    }
}
