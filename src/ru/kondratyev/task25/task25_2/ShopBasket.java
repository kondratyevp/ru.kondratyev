package ru.kondratyev.task25.task25_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopBasket implements Basket {

    private Map<String, Integer> productsInBasket = new HashMap<>();

    public void addProduct(String product, int quantity) {
        productsInBasket.put(product, quantity);
    }

    public void removeProduct(String product) {
        productsInBasket.remove(product);
    }

    public void updateProductQuantity(String product, int quantity) {
        productsInBasket.replace(product, quantity);
    }

    public void clear() {
        productsInBasket.clear();
    }

    public List<String> getProducts() {
        List<String> getProducts = new ArrayList<>(productsInBasket.keySet());
        return getProducts;
    }

    public int getProductQuantity(String product) {
        return productsInBasket.get(product);
    }

    @Override
    public String toString() {
        return "ShopBasket{" +
                "productsInBasket=" + productsInBasket +
                '}';
    }
}
