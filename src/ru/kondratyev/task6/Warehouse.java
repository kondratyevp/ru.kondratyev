package ru.kondratyev.task6;

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
