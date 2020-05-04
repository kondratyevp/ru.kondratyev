package ru.kondratyev.task18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class Encoding {

    private static String s1;

    public static void main(String args[]) {
        try {
            String stroka1 = new String("Наша Таня громко плачет,\nУронила в речку мячик.");
            byte[] stroka2 = stroka1.getBytes("UTF-8");
            System.out.println(stroka2);
            FileOutputStream fos = new FileOutputStream("D:\\NewFolder\\text.txt");
            fos.write(stroka2);
            fos.flush();
        } catch (IOException e) {
            e.getMessage();
        }
        try (FileInputStream in = new FileInputStream("D:\\NewFolder\\text.txt");
             FileOutputStream fos = new FileOutputStream("D:\\NewFolder\\newtext.txt")) {
            byte[] buffer = new byte[in.available()];
            in.read(buffer);
            Charset utf8 = Charset.forName("UTF-8");
            String s1 = new String(buffer, utf8);
            System.out.println(s1);
            buffer = s1.getBytes("Windows-1251");
            fos.write(buffer);
            fos.flush();
            System.out.println(buffer);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}