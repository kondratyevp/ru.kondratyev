package ru.kondratyev.task7;

import java.util.Scanner;

class Automat {
    public int money;
    public int numDrink;
    int i = 0;

    Automat() {
        money = 0;
        numDrink = 0;

    }

    public enum Drinks {
        ESPRESSO(1, " Эспрессо", 10),
        KOFFEE(2, " Кофе", 15),
        KAPPUCHINO(3, " Капучино", 20),
        TEA(4, " Чай", 25);
        int numDrink;
        String nameDrink;
        int price;

        Drinks(int numDrink, String nameDrink, int price) {
            this.nameDrink = nameDrink;
            this.price = price;
            this.numDrink = numDrink;
        }
    }

    public void Menu() {
        for (Drinks d : Drinks.values()) {
            System.out.println(d.numDrink + " " + d.nameDrink + "  " + d.price);
        }
    }

    public void Drink() {
        Scanner in = new Scanner(System.in);
        if (money <= 0) {
            System.out.println("Вы не внесли деньги");
        } else {
            System.out.println("Выберите напиток: ");
            numDrink = in.nextInt();
        }
        for (Drinks d : Drinks.values()) {
            i++;
            if (numDrink == i) {
                System.out.println("Вы выбрали: " + d.nameDrink + " - " + d.price);
                while (money < d.price) {
                    System.out.println("Недостаточно денег, необходимо " + d.price + ". Внесите деньги ещё раз");
                    money = in.nextInt();
                }
                System.out.println("Заберите ваш " + d.nameDrink);
            }
        }
    }
}