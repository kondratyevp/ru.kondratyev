package ru.kondratyev.task4;

import java.util.Scanner;

public class Progression {
    public static void main(String[] args) {
        int firstNumber;
        int count;
        int constant;
        String progression = "";
        int grow;
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начальное число");
        firstNumber = in.nextInt();
        System.out.println("Введите длину прогрессии");
        count = in.nextInt();
        System.out.println("Введите постоянную прогрессии");
        constant = in.nextInt();
        grow = firstNumber;
        for (i = 1; i < count; i++) {
            grow = grow + constant;
            progression = progression + ", " + grow;
        }
        System.out.println("Арифметическая прогрессия:  " + firstNumber + progression);

        progression = "";
        grow = firstNumber;
        for (i = 1; i < count; i++) {
            grow = grow * constant;
            progression = progression + ", " + grow;
        }
        System.out.println("Геометрическая прогрессия:  " + firstNumber + progression);
    }

}
