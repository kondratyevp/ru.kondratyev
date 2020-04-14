package ru.kondratyev.task9.AnimalInterface;


class Cat extends Animal implements Run {

    public Cat(String animal) {
        super(animal);
    }

    public void getName() {
        System.out.println(getAnimal());
    }

    public void getRun() {
        System.out.println("Бегает");
    }
}
