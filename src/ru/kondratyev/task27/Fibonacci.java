package ru.kondratyev.task27;

public class Fibonacci {

    int prev1 = 1;
    int next = 1;
    int prev2 = 0;

    public void fibonacci(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(" " + next);
            next = prev2 + prev1;
            prev2 = prev1;
            prev1 = next;
        }
    }

    public int fibonacciRecurs(int prev2, int prev1, int num) {
        if (num != 0) {
            next = prev2 + prev1;
            System.out.print(" " + next);
            prev1 = fibonacciRecurs(next, prev2, num - 1);
        }
        return next;
    }

    public static void main(String[] args) {
        Fibonacci m = new Fibonacci();
        m.fibonacci(11);
        System.out.println();
        m.fibonacciRecurs(0, 1, 11);
    }
}

