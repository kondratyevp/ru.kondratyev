package ru.kondratyev.task13;

import java.util.ArrayList;

import static ru.kondratyev.task13.Food.CARROT;
import static ru.kondratyev.task13.Food.KASHA;

public class Child {

    private ArrayList<Food> dontLikeList = new ArrayList<>();

    public Child() {
        dontLikeList.add(CARROT);
        dontLikeList.add(KASHA);
    }

    public void says() {
        System.out.println("Спасибо мама");
    }

    public void eat(Food foodFromMom) throws DontWantThisFoodException {
        if (dontLikeList.contains(foodFromMom)) {
            throw new DontWantThisFoodException();
        }
        System.out.println("Съел за обе щёки");
        says();
    }
}



