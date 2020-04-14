package ru.kondratyev.task9.Man;

public class ManRunAndSwim {
    public static void main(String[] args) {
        Man1 bob = new Man1();
        bob.speed = 10;
        bob.time = 2;
        bob.speed();
        bob.distance();
        bob.place("Парк");
        bob.skillSwim(true);
        bob.swim();
    }
}
