package ru.kondratyev.task9.AnimalInterface;


class Dog extends Animal implements Run, Swim {

    public Dog(String animal) {
        super(animal);
    }

    public void getName() {
        System.out.println(getAnimal());
    }

    public void getRun() {
        System.out.println("Бегает");
    }

    public void getSwim() {
        System.out.println("Плавает");
    }
}