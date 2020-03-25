package ru.kondratyev.task3;

import java.util.Scanner;

public class HotCold {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * (100 - 1));
        //return rand;
        int userNumber;
        int previousUserNumber = 0;
        //System.out.println (rand);

        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        userNumber = in.nextInt();

        while (userNumber != rand) {
            if (Math.abs(rand - userNumber) > Math.abs(rand - previousUserNumber)) {
                System.out.println("Холодно");
                //userNumber = in.nextInt();
            } else {
                System.out.println("Горячо");
                //userNumber = in.nextInt();
            }
            previousUserNumber = userNumber;
            userNumber = in.nextInt();
            //System.out.println(rand - userNumber);
            //System.out.println(rand - previousUserNumber);
        }
        System.out.println("Правильно");
    }

}
