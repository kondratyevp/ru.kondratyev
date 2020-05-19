package ru.kondratyev.task23;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShopBasket implements Basket {

    static List<Product> products = new ArrayList<>();

    public void addProduct(String product, int quantity) { //ok ok

        products.add(new Product(product, quantity));
    }

    public void removeProduct(String product) { //ok ok
        Iterator iterator = products.iterator();
        while (iterator.hasNext()) {
            Product setProduct = (Product) iterator.next();
            String s = setProduct.getName();
            if (s.equals(product))
                iterator.remove();
        }
    }

    public void updateProductQuantity(String product, int quantity) { //ok ok
        Iterator iterator = products.iterator();
        while (iterator.hasNext()) {
            Product setProduct = (Product) iterator.next();
            String s = setProduct.getName();
            if (s.equals(product))
                setProduct.setQuantity(quantity);
        }
    }

    public void clear() { //ok
        products.clear();
    }


    public List<String> getProducts() { //ok ok
        List<String> getProducts = new ArrayList<>();
        Iterator iterator = products.iterator();
        String s = new String();
        while (iterator.hasNext()) {
            Product setProduct = (Product) iterator.next();
            s = setProduct.getName();
            getProducts.add(s);
        }
        for (String product : getProducts)
            System.out.println(product);
        System.out.println();
        return getProducts;
    }

    public int getProductQuantity(String product) { //ok ok
        Iterator iterator = products.iterator();
        int getProductQuantity = 0;
        while (iterator.hasNext()) {
            Product setProduct = (Product) iterator.next();
            String s = setProduct.getName();
            if (s.equals(product)) {
                getProductQuantity = setProduct.getQuantity();
            }
        }
        System.out.println("" + product + " = " + getProductQuantity);
        System.out.println();
        return getProductQuantity;
    }

    public static void printProducts(List<Product> products) {
        for (Product product : products)
            System.out.println(product);
        System.out.println();
    }

    public static void main(String[] args) {

        ShopBasket sb = new ShopBasket();

        sb.addProduct("Яблоко", 10);
        sb.addProduct("Груша", 15);
        sb.addProduct("Апельсин", 20);

        System.out.println("Корзина:");
        printProducts(products);

        System.out.println("Удаления яблок из корзины:");
        sb.removeProduct("Яблоко");
        printProducts(products);

        System.out.println("Изменение количества груш:");
        sb.updateProductQuantity("Груша", 30);
        printProducts(products);

        System.out.println("Получения списка товаров в корзине:");
        sb.getProducts();

        System.out.println("Количество выбранного товара:");
        sb.getProductQuantity("Апельсин");

        System.out.println("Очистка корзины:");
        sb.clear();
        printProducts(products);
    }
}
