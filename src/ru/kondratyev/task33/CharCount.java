package ru.kondratyev.task33;

import java.util.*;

public class CharCount {

    private static Map<Character, Integer> countChars(String str) {
        Map<Character, Integer> chars = new TreeMap<>();
        for (char ch : str.toCharArray())
            if (chars.containsKey(ch)) {
                chars.put(ch, chars.get(ch) + 1);
            } else chars.put(ch, 1);
        return chars;
    }

    private static int maxChar(Map<Character, Integer> map) {
        List<Integer> values = new ArrayList<>(map.values());
        return Collections.max(values);
    }

    private static void printMaxChars(int i, Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            if (i == ( pair.getValue() )) {
                System.out.println("Character: " + pair.getKey() + " has occurred maximum times in String: " + pair.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String s = "This is test message";
        final Map<Character, Integer> map = countChars(s);
        printMaxChars(maxChar(map), map);
    }
}



