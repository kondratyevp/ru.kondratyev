package ru.kondratyev.task19;

public class Product {
    private String name;
    private String quantity;
    private String price;

    public Product(String name, String quantity, String price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }


}
