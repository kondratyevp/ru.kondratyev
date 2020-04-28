package ru.kondratyev.task13;

import java.util.ArrayList;

public class Child {

    public void says() {
        System.out.println("Спасибо мама");
    }

    public void dontWontFood(Food foodFromMom) throws DontWantThisFoodException {
        ArrayList<Food> dontLikeList = new ArrayList<>();
        dontLikeList.add(0, Food.CARROT);
        dontLikeList.add(1, Food.KASHA);
        if (dontLikeList.contains(foodFromMom)) {
            throw new DontWantThisFoodException();
        }
    }

}

