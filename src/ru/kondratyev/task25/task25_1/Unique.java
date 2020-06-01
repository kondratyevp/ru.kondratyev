package ru.kondratyev.task25.task25_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Unique {

    private Map<String, String> men = new HashMap<>();

    public boolean isUnique(Map<String, String> map) {
        ArrayList values = new ArrayList<>(map.values());
        for (Object value1 : values) {
            int i = Collections.frequency(values, value1);
            if (i > 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Unique unique = new Unique();
        unique.men.put("Вася", "Иванов");
        unique.men.put("Пётр", "Петров");
        unique.men.put("Виктор", "Сидоров");
        unique.men.put("Сергей", "Савельев");
        unique.men.put("Вадим", "Викторов");
        System.out.println(unique.men);
        boolean b = unique.isUnique(unique.men);
        System.out.println(b);
        unique.men.put("Виктор", "Иванов");
        System.out.println(unique.men);
        b = unique.isUnique(unique.men);
        System.out.println(b);
        unique.men.clear();
        System.out.println(unique.men);
        b = unique.isUnique(unique.men);
        System.out.println(b);
    }

    @Override
    public String toString() {
        return "Unique{" +
                "men=" + men +
                '}';
    }
}
