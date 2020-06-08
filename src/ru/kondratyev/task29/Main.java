package ru.kondratyev.task29;

import static ru.kondratyev.task29.PersonMap.createMap;
import static ru.kondratyev.task29.PersonMap.removeTheDuplicates;

public class Main {
    public static void main(String[] args) {

        System.out.println(createMap());
        removeTheDuplicates(createMap());
    }
}
