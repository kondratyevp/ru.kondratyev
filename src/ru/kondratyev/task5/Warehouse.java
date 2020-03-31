package ru.kondratyev.task5;

public class Warehouse {
    public int count; // количество товара
    private int numRack; // номер полки
    private String nameProduct; // название товара

    public void Warehouse(String n, int c, int r) {
        count = c;
        numRack = r;
        nameProduct = n;
    }

    public void registration() {
        System.out.println("Товар: " + nameProduct + " Количество: " + count + " Полка № " + numRack);
    }

    public String getNameProduct() {
        return nameProduct;
    }
}

class FreshWarehouse extends Warehouse {
    public int time; // срок хранения
    public String nameProduct;

    public void perishable() {
        if (time < 5) System.out.println(nameProduct + " скоропортящийся товар");
        else System.out.println(nameProduct + " не скоропортящийся товар");
    }
}

class Work {
    public static void main(String[] args) {
        Warehouse product1 = new Warehouse();
        product1.Warehouse("apple", 3, 5);
        product1.registration();
        FreshWarehouse product2 = new FreshWarehouse();
        product2.nameProduct = product1.getNameProduct();
        product2.time = 4;
        product2.perishable();
    }
}