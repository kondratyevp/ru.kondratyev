package ru.kondratyev.task13;

public class Child {
    String foodForChild;

    public void eat(String foodForChild) throws Exception {
        if (foodForChild.equals(Food.CARROT.food)) {
            throw new Exception();
        } else if (foodForChild.equals(Food.KASHA.food)) {
            throw new Exception();
        } else {
            System.out.println("Съел " + foodForChild + " за обе щёки");
        }
    }
}
