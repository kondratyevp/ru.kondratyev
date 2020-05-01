package ru.kondratyev.task13;

public class Mom {
    public static void main(String[] args) {
        int i;
        Child child1 = new Child();
        for (i = 0; i < Food.values().length; i++) {
            System.out.println("\n" + Food.values()[i].food);
            try {
                child1.eat(Food.values()[i]);
            } catch (DontWantThisFoodException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}