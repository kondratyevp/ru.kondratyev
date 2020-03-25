package ru.kondratyev.task2;

import java.util.Scanner;

public class SecondsInHours {
    public static void main(String[] args) {
        int second = 10800;

        System.out.println("Введите секунды");
        Scanner in = new Scanner(System.in);
        second = in.nextInt();

        double hours = second / 3600;
        System.out.println(second + " секунд равня0ются " + hours + " часам");
        System.out.println(hours);
    }
}
