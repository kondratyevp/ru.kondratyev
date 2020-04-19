package ru.kondratyev.task14;

public enum DrinksLog {
    ESPRESSO(1, " Эспрессо", 10),
    KOFFEE(2, " Кофе", 15),
    KAPPUCHINO(3, " Капучино", 20),
    TEA(4, " Чай", 25);
    int numDrink;
    String nameDrink;
    int price;

    DrinksLog(int numDrink, String nameDrink, int price) {
        this.nameDrink = nameDrink;
        this.price = price;
        this.numDrink = numDrink;
    }
}
