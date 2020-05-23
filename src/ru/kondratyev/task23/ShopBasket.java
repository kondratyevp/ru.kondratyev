package ru.kondratyev.task23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShopBasket implements Basket {

    private List<Product> productsInBasket = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();

    public List<Product> getProductsInBasket() {
        return productsInBasket;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public int findProduct(String product) {
        for (Product p : productsInBasket) {
            if (p.getName().equals(product))
                return productsInBasket.indexOf(p);
        }
        return -1;
    }

    public void addProduct(String product, int quantity) { //ok
        int i = findProduct(product); //productsInBasket.indexOf(new Product(product));
        if (i != -1) {
            quantities.set(i, quantity);
        } else {
            productsInBasket.add(new Product(product));
            quantities.add(quantity);
        }
    }

    public void removeProduct(String product) {//ok
        Iterator iterator = productsInBasket.iterator();
        while (iterator.hasNext()) {
            Product p = (Product) iterator.next();
            String s = p.getName();
            if (s.equals(product)) {
                int i = productsInBasket.indexOf(p);
                quantities.remove(i);
                iterator.remove();
            }
        }
    }

    public void updateProductQuantity(String product, int quantity) {
        int i = findProduct(product);
        if (i != -1)
            quantities.set(i, quantity);
    }

    public void clear() {
        productsInBasket.clear();
        quantities.clear();
    }

    public List<String> getProducts() {
        List<String> getProducts = new ArrayList<>();
        for (Product p : productsInBasket) {
            getProducts.add(p.getName());
        }
        System.out.println(getProducts);
        return getProducts;
    }

    public int getProductQuantity(String product) {
        int i = findProduct(product);
        if (i != -1)
            System.out.println("" + product + " = " + quantities.get(i));
        return i;
    }

    @Override
    public String toString() {
        return "ShopBasket{" +
                "productsInBasket=" + productsInBasket +
                ", quantities=" + quantities +
                '}';
    }
}

