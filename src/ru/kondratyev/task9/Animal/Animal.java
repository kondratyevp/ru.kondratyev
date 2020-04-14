package ru.kondratyev.task9.Animal;

abstract class Animal {
    private String animal;

    public String getAnimal() {
        return animal;
    }

    public Animal(String animal) {
        this.animal = animal;
    }

    public abstract void getName();
}