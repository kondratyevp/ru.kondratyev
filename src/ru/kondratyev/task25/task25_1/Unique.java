package ru.kondratyev.task25.task25_1;

import java.util.HashMap;
import java.util.Map;

public class Unique {

    private Map<String, String> men = new HashMap<>();

    public boolean isUnique(Map<String, String> map) {
        if (!map.isEmpty()) {
            for (Object value1 : map.values()) {
                int i = 0;
                for (Object value2 : map.values()) {
                    if (value1.equals(value2))
                        i++;
                }
                if (i > 1)
                    return false;
            }
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
