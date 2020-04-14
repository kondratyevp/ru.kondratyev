package ru.kondratyev.task9.AnimalInterface;

class Duck extends Animal implements Fly, Run, Swim {

    public Duck(String animal) {
        super(animal);
    }

    public void getName() {
        System.out.println(getAnimal());
    }

    public void getRun() {
        System.out.println("Бегает");
    }

    public void getFly() {
        System.out.println("Летает");
    }

    public void getSwim() {
        System.out.println("Плавает");
    }
}
