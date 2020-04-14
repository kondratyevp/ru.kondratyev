package ru.kondratyev.task9.Animal;

class Duck extends Animal {

    public Duck(String animal) {
        super(animal);
    }

    public void getName() {
        System.out.println(getAnimal());
    }
}
