package ru.kondratyev.task7;

import java.util.Scanner;

public class VendingAutomat {
    public static void main(String[] args) {
        Automat automat = new Automat();
        automat.Menu();
        Scanner in = new Scanner(System.in);
        System.out.println("Внесите деньги ");
        automat.money = in.nextInt();
        automat.Drink();
    }
}