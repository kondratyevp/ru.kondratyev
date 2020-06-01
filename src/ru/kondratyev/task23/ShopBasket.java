package ru.kondratyev.task23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShopBasket implements Basket {

    private List<Product> productsInBasket = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();


    public void addProduct(String product, int quantity) {
        int i = indexOfProduct(product);
        if (i != -1) {
            quantities.set(i, quantity);
        } else {
            productsInBasket.add(new Product(product));
            quantities.add(quantity);
        }
    }

    public void removeProduct(String product) {
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
        int i = indexOfProduct(product);
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
        return getProducts;
    }

    public int getProductQuantity(String product) {
        int i = indexOfProduct(product);
        if (i != -1)
            return quantities.get(i);
        return 0;
    }

    private int indexOfProduct(String product) {
        for (Product p : productsInBasket) {
            if (p.getName().equals(product))
                return productsInBasket.indexOf(p);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "ShopBasket{" +
                "productsInBasket=" + productsInBasket +
                ", quantities=" + quantities +
                '}';
    }
}

