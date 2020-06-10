package ru.kondratyev.task33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class CharCount {

    private static Map<Character, Integer> maxChar(String str) {
        Map<Character, Integer> chars = new TreeMap<>();
        for (char ch : str.toCharArray())
            if (chars.containsKey(ch)) {
                chars.put(ch, chars.get(ch) + 1);
            } else chars.put(ch, 1);
        return chars;
    }

    private static void maxCharInString(Map<Character, Integer> map) {
        ArrayList values = new ArrayList<>(map.values());
        Collections.sort(values);
        int i = (int) values.get(values.size() - 1);
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            if (i == ( pair.getValue() )) {
                System.out.println("Character: " + pair.getKey() + " has occurred maximum times in String: " + pair.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String s = "This is test message";
        maxCharInString(maxChar(s));
    }
}



