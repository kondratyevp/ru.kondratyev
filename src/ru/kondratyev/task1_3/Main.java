package ru.kondratyev.task1_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int second = 10800;


        System.out.println("Введите секунды");
        Scanner in = new Scanner(System.in);
        second = in.nextInt();

        double hours = second/3600;

        System.out.println(second +" секунд равяются "+hours+" часам");
        System.out.println (hours);
    }
}
