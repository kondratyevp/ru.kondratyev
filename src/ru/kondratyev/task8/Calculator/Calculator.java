package ru.kondratyev.task8.Calculator;

public class Calculator {

    public static void summa(double a, double b) {
        System.out.printf("%s+%s=%s %n", a, b, a + b);
    }

    public static void subtract(double a, double b) {
        System.out.printf("%s-%s=%s %n", a, b, a - b);
    }

    public static void multiplication(double a, double b) {
        System.out.printf("%s*%s=%s %n", a, b, a * b);
    }

    public static void division(double a, double b) {
        System.out.printf("%s/%s=%s %n", a, b, a / b);
    }

    public static void percent(double a, int percent) {
        System.out.printf("%s процентов от %s=%s %n", percent, a, a / 100 * percent);
    }

    public static void main(String[] args) {
        summa(50, 10);
        subtract(20, 10);
        multiplication(5.5, 6);
        division(40, 5);
        percent(50, 25);
    }
}