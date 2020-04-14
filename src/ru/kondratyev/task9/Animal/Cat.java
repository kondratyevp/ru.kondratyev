package ru.kondratyev.task9.Animal;

class Cat extends Animal {

    public Cat(String animal) {
        super(animal);
    }

    public void getName() {
        System.out.println(getAnimal());
    }
}

