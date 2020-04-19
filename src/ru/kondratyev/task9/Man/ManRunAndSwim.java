package ru.kondratyev.task9.Man;

public class ManRunAndSwim {
    public static void main(String[] args) {
        Man1 bob = new Man1();
        Man2 bill = new Man2();
        bob.speed = 10;
        bob.time = 2;
        System.out.println("Боб:");
        bob.speed();
        bob.distance();
        bob.place("Парк");
        bob.skillSwim = true;
        bob.swim();

        bill.speed = 5;
        bill.time = 7;
        System.out.println("\nБилл:");
        bill.speed();
        bill.distance();
        bill.place("лес");
        bill.skillSwim = false;
        bill.swim();
    }
}
