package ru.kondratyev.task23;

public class Main {
    public static void main(String[] args) {

        ShopBasket sb = new ShopBasket();

        sb.addProduct("Яблоко", 10);
        sb.addProduct("Груша", 15);
        sb.addProduct("Апельсин", 20);

        System.out.println("Корзина:");
        System.out.println(sb);
        System.out.println();
        sb.addProduct("Яблоко", 5);
        System.out.println("Изменение количества яблок:");
        System.out.println(sb);
        System.out.println();
        System.out.println("Удаление яблок из корзины:");
        sb.removeProduct("Яблоко");
        System.out.println(sb);
        System.out.println();
        System.out.println("Изменение количества груш:");
        sb.updateProductQuantity("Груша", 30);
        System.out.println(sb);
        System.out.println();
        System.out.println("Получение списка товаров в корзине:");
        System.out.println(sb.getProducts());
        System.out.println();
        System.out.println("Количество выбранного товара:");
        System.out.println("" + "Апельсин" + " = " + sb.getProductQuantity("Апельсин"));
        System.out.println();
        System.out.println("Очистка корзины:");
        sb.clear();
        System.out.println(sb);
    }
}

