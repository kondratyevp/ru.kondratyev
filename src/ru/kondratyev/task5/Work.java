package ru.kondratyev.task5;

public class Work {
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
