package ru.kondratyev.task11;

public class Censor {
    public static void main(String[] args) {
        String s = "Встретились бяка и Бука. Никто не издал ни звука. Никто не подал и знака —Молчали Бука и Бяка.";
        String censor = "Вырезано цензурой!";
        s = s.toLowerCase().replace("бяка", censor);
        System.out.println(s);
    }
}


