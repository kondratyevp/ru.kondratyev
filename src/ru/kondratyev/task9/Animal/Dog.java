package ru.kondratyev.task9.Animal;

class Dog extends Animal {

    public Dog(String animal) {
        super(animal);
    }

    public void getName() {
        System.out.println(getAnimal());
    }
}

