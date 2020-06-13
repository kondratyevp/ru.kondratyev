package ru.kondratyev.task29;

import java.util.Map;

import static ru.kondratyev.task29.PersonMap.createMap;
import static ru.kondratyev.task29.PersonMap.removeTheDuplicates;

public class Main {
    public static void main(String[] args) {

        final Map<String, Person> map = createMap();
        System.out.println(map);
        removeTheDuplicates(map);
        System.out.println(map);
    }
}
