package ru.kondratyev.task4;

import java.util.Scanner;

public class Description {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        number = in.nextInt();
        if (number < 0) System.out.println("отрицательное");
        else {
            if (number > 0) System.out.println("положительное");
            else System.out.println("Вы ввели 0");
        }
        if (number % 2 == 0) System.out.println("чётное");
        else System.out.println("нечётное");
    }
}
