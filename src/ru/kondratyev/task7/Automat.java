package ru.kondratyev.task7;

import java.util.Scanner;

class Automat {
    public int money;

    public void Menu() {
        for (Drinks d : Drinks.values()) {
            System.out.println(d.ordinal() + 1 + " " + d.nameDrink + "  " + d.price);
        }
    }

    public void buyDrink() {
        int numberDrink = 0;
        Scanner in = new Scanner(System.in);
        if (money <= 0) {
            System.out.println("Вы не внесли деньги");
        } else {
            System.out.println("Выберите напиток: ");
            numberDrink = ( in.nextInt() - 1 );
            //}

            if (numberDrink >= Drinks.values().length) {
                System.out.println("Вы выбрали несуществующий напиток");
            } else {
                System.out.println("Вы выбрали: " + Drinks.values()[numberDrink].nameDrink + " - " + Drinks.values()[numberDrink].price);
                while (money < Drinks.values()[numberDrink].price) {
                    System.out.println("Недостаточно денег, необходимо ещё - " + ( Drinks.values()[numberDrink].price - money ));
                    money += in.nextInt();
                }
                System.out.println("Заберите ваш " + Drinks.values()[numberDrink].nameDrink);
                if (money > Drinks.values()[numberDrink].price) {
                    System.out.println("Заберите вашу сдачу " + ( money - Drinks.values()[numberDrink].price ));
                }
            }
        }
    }
}


