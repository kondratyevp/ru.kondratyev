package ru.kondratyev.task2;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        double salary = 1000;
        int tax = 13;

        System.out.println("Введите зарплату");
        Scanner in = new Scanner(System.in);
        salary = in.nextDouble();

        System.out.println("Введите налог");
        tax = in.nextInt();

        double total = salary - (salary * tax / 100);
        System.out.println("Зарплата после уплаты налога");
        System.out.println(total);
    }
}
