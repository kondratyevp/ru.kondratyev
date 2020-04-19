package ru.kondratyev.task14;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class AutomatLog {

    private final static Logger logo1 = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public int money;

    public void Menu() {
        for (DrinksLog d : DrinksLog.values()) {
            System.out.println(d.ordinal() + 1 + " " + d.nameDrink + "  " + d.price);
        }
    }

    public void buyDrink() {
        int numberDrink = 0;
        Scanner in = new Scanner(System.in);
        if (money <= 0) {
            System.out.println("Вы не внесли деньги");
            logo1.log(Level.WARNING, "Не внесены деньги");
        } else {
            System.out.println("Выберите напиток: ");
            numberDrink = in.nextInt() - 1;

            try {
                logo1.log(Level.INFO, "Выбран напиток " + DrinksLog.values()[numberDrink].nameDrink);
            } catch (Exception e) {
                logo1.log(Level.SEVERE, e.getMessage());
            }

            if (numberDrink >= DrinksLog.values().length) {
                System.out.println("Вы выбрали несуществующий напиток");
                logo1.log(Level.WARNING, "Выбран несуществующий напиток");
            } else {
                System.out.println("Вы выбрали: " + DrinksLog.values()[numberDrink].nameDrink + " - " + DrinksLog.values()[numberDrink].price);
                while (money < DrinksLog.values()[numberDrink].price) {
                    logo1.log(Level.INFO, "Внесено недостаточно денег");
                    System.out.println("Недостаточно денег, необходимо ещё - " + ( DrinksLog.values()[numberDrink].price - money ));
                    money += in.nextInt();
                }
                System.out.println("Заберите ваш " + DrinksLog.values()[numberDrink].nameDrink);
                if (money > DrinksLog.values()[numberDrink].price) {
                    System.out.println("Заберите вашу сдачу " + ( money - DrinksLog.values()[numberDrink].price ));
                }
            }

        }
    }
}

