package ru.kondratyev.task25.task25_2;

import java.util.*;

public class ShopBasket implements Basket {

    private Map<String, Integer> productsInBasket = new HashMap<>();

    public Map<String, Integer> getProductsInBasket() {
        return productsInBasket;
    }

    public void addProduct(String product, int quantity) {
        productsInBasket.put(product, quantity);
    }

    public void removeProduct(String product) {
        Iterator<String> iterator = productsInBasket.keySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(product)) {
                iterator.remove();
            }
        }
    }

    public void updateProductQuantity(String product, int quantity) {
        productsInBasket.put(product, quantity);
    }

    public void clear() {
        productsInBasket.clear();
    }

    public List<String> getProducts() {
        List<String> getProducts = new ArrayList<>();
        for (Map.Entry<String, Integer> e : productsInBasket.entrySet())
            getProducts.add(e.getKey());
        System.out.println(getProducts);
        return getProducts;
    }

    public int getProductQuantity(String product) {
        for (Map.Entry<String, Integer> e : productsInBasket.entrySet())
            if (e.getKey().equals(product)) {
                System.out.println("" + product + " = " + e.getValue());
                return e.getValue();
            }
        return 0;
    }

    @Override
    public String toString() {
        return "ShopBasket{" +
                "productsInBasket=" + productsInBasket +
                '}';
    }
}
