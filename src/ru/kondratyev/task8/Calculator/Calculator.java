package ru.kondratyev.task8.Calculator;

public class Calculator {
    private static double a;
    private static double b;
    private static int percent;

    static void SetAB(double na, double nb, int npercent) {
        a = na;
        b = nb;
        percent = npercent;
    }
    //double GetA() { return a; }
    //double GetB() { return b; }
    //int GetPercent(){return percent;}

    public static void summa() {
        double v = a + b;
        System.out.printf("%s+%s=%s %n", a, b, v);
    }

    public static void subtract() {
        double v = a - b;
        System.out.printf("%s-%s=%s %n", a, b, v);
    }

    public static void multiplication() {
        double v = a * b;
        System.out.printf("%s*%s=%s %n", a, b, v);
    }

    public static void division() {
        double v = a / b;
        System.out.printf("%s/%s=%s %n", a, b, v);
    }

    public static void percent() {
        double v = a / 100 * percent;
        System.out.printf("%s процентов от %s=%s %n", percent, a, v);
    }

    public static void main(String[] args) {
        Calculator num = new Calculator();
        SetAB(4, 5, 10);
        summa();
        subtract();
        multiplication();
        division();
        percent();
    }
}