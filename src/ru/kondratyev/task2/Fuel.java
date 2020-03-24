package ru.kondratyev.task2;



import java.util.Scanner;

public class Fuel {

    public static void main(String[] args) {
        double price = 42.5;
        int fuel = 30;
        System.out.println("Введите цену бензина");
        Scanner in = new Scanner(System.in);
        price = in.nextDouble();

        System.out.println("Введите количество бензина");
        fuel = in.nextInt();

        double total = price*fuel;
        System.out.println ("Стоимость бензина");
        System.out.println (total);
    }
}