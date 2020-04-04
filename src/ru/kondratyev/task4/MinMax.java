package ru.kondratyev.task4;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int number1, number2;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число 1");
        number1 = in.nextInt();
        System.out.println("Введите число 2");
        number2 = in.nextInt();
        if (number1 < number2) System.out.println(number1 + " меньше чем " + number2);
        else if (number1 > number2) System.out.println(number2 + " меньше чем " + number1);
        else System.out.println(number1 + " равно  " + number2);
    }
}