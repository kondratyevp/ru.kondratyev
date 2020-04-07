package ru.kondratyev.task8.Count;

public class Count {

    private static int number = 0;

    public Count() {
        number++;
    }

    public static int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Count c = new Count();
        Count c1 = new Count();
        //Count c3 = new Count();
        //Count c4 = new Count();
        System.out.println("Созданы " + getNumber() + " объекта класса Count");
    }
}