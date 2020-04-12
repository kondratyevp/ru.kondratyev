package ru.kondratyev.task8.Calculator;

public class Calculator {
    private Calculator() {
    }

    public static double summa(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double percent(double a, int percent) {
        return a / 100 * percent;
    }

    public static void main(String[] args) {
        new Calculator();
        System.out.println(summa(50, 10));
        System.out.println(subtract(20, 10));
        System.out.println(multiplication(5.5, 6));
        System.out.println(division(40, 5));
        System.out.println(percent(50, 25));
    }
}