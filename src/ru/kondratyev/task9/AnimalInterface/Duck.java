package ru.kondratyev.task9.AnimalInterface;

class Duck extends Animal implements Flyable, Runnable, Swimmable {

    public Duck(String animal) {
        super(animal);
    }

    public void getName() {
        System.out.println(getAnimal());
    }

    public void Run() {
        System.out.println("Бегает");
    }

    public void Fly() {
        System.out.println("Летает");
    }

    public void Swim() {
        System.out.println("Плавает");
    }
}
