package ru.kondratyev.task23;

public class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* @Override
    public boolean equals(Object p) {
        return this.name.equals(( (Product) p ).getName());
    }*/

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
