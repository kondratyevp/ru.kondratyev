package ru.kondratyev.task6;

public class FreshWarehouse extends Warehouse {
    public int time; // срок хранения
    public String nameProduct;

    public void perishable() {
        if (time < 5) System.out.println(nameProduct + " скоропортящийся товар");
        else System.out.println(nameProduct + " не скоропортящийся товар");
    }
}
