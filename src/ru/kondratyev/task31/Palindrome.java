package ru.kondratyev.task31;

public class Palindrome {

    private static boolean isPalindrom1(String str) {
        int length = str.length();
        for (int i = 0; i < ( length ) / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i))
                return false;
        }
        return true;
    }

    private static boolean isPalindrom2(String str) {
        StringBuilder reverseStr = new StringBuilder();
        reverseStr.append(str);
        reverseStr.reverse();
        System.out.println(reverseStr + " " + str);
        return reverseStr.toString().equals(str);
    }

    public static void main(String[] args) {
        String s = "topot";
        System.out.println(isPalindrom1(s));
        System.out.println();
        System.out.println(isPalindrom2(s));
    }
}

