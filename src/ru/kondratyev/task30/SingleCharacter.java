package ru.kondratyev.task30;

import java.util.HashMap;
import java.util.Map;

public class SingleCharacter {

    private static char duplicates(String str) {
        Map<Character, Integer> chars = new HashMap<>();
        for (char ch : str.toCharArray())
            if (chars.containsKey(ch)) {
                chars.put(ch, chars.get(ch) + 1);
            } else chars.put(ch, 1);
        for (char ch : str.toCharArray()) {
            if (chars.get(ch) == 1)
                return ch;
        }
        return '-';
    }

    public static void main(String[] args) {
        String s = "teter";
        System.out.println(duplicates(s));
    }
}
