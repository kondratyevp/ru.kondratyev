package ru.kondratyev.task27;

public class Fibonacci {

    public static void fibonacci(int num) {
        int p1 = 0;
        int p2 = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(p1 + " ");
            p2 = p2 + p1;
            p1 = p2 - p1;
        }
    }

    public static void fibonacciRecursPrint(int num) {
        fibonacciRecurs(0, 1, num);
    }

    private static void fibonacciRecurs(int p2, int p1, int num) {
        if (num != 0) {
            System.out.print(p2 + " ");
            p2 = p2 + p1;
            fibonacciRecurs(p2, p2 - p1, num - 1);
        }

    }

    public static void main(String[] args) {
        fibonacci(11);
        System.out.println();
        fibonacciRecursPrint(11);
    }
}

