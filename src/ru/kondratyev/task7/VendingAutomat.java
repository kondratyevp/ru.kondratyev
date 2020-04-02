package ru.kondratyev.task7;

import java.util.Scanner;

class Automat {
    public int many;

    Automat() {
        many = 0;
    }

    public void Menu() {
        for (Drink.Drinks d : Drink.Drinks.values()) {
            System.out.println(d);
        }
    }
}

class Drink {
    public int price;
    public Integer numDrink;

    public enum Drinks {ESPRESSO, KOFFEE, KAPUCHINO, TEA;}

}

public class VendingAutomat {
    public static void main(String[] args) {
        Automat automat1 = new Automat();
        Drink drink1 = new Drink();
        automat1.Menu();
        Scanner in = new Scanner(System.in);
        System.out.println("Внесите деньги ");
        automat1.many = in.nextInt();
        if (automat1.many <= 0) {
            System.out.println("Вы не внесли деньги");
        } else {
            System.out.println("Выберите напиток: 1-ESPRESSO-10 руб., 2-KOFFEE-15 руб., 3-KAPUCHINO-20 руб., 4-TEA-25 руб. ");
            drink1.numDrink = in.nextInt();
            switch (drink1.numDrink) {
                case 1: {
                    System.out.println("Вы выбрали ESPRESSO");
                    drink1.price = 10;
                    break;
                }
                case 2: {
                    System.out.println("Вы выбрали KOFFEE");
                    drink1.price = 15;
                    break;
                }
                case 3: {
                    System.out.println("Вы выбрали KAPUCHINO");
                    drink1.price = 20;
                    break;
                }
                case 4: {
                    System.out.println("Вы выбрали TEA");
                    drink1.price = 25;
                    break;
                }
                default:
                    System.out.println("Вы ничего не выбрали");
            }
            if (automat1.many < drink1.price) {
                System.out.println("Недостаточно денег");
            }
        }
    }
}