package ru.kondratyev.task9.Man;

public class Man1 extends Man {
    public int speed;
    public int time;
    public boolean skillSwim;

    public int getTime() {
        return time;
    }

    public int speed() {
        System.out.printf("Скорость %s, время %s", speed, time);
        return speed;
    }

    public int distance() {
        System.out.println("\nДистанция: " + speed * time);
        return speed * time;
    }

    public String place(String place) {
        System.out.printf("Место пробежки: %s", place);
        return place;
    }

    public boolean skillSwim(boolean skillSwim) {
        return skillSwim;
    }

    public void swim() {
        if (skillSwim(skillSwim)) {
            System.out.println("\nМожно в воду");
        } else {
            System.out.println("\nЛучше побыть на берегу");
        }
    }
}
