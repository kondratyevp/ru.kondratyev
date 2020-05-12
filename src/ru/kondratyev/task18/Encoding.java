package ru.kondratyev.task18;

import java.io.*;
import java.nio.charset.Charset;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Encoding {

    public static void main(String[] args) {
        try {
            String stroka1 = "Наша Таня громко плачет,\nУронила в речку мячик.";
            byte[] stroka2 = stroka1.getBytes(UTF_8);
            FileOutputStream fos = new FileOutputStream("out" + File.separator + "text.txt");
            fos.write(stroka2);
            fos.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader("out" + File.separator + "text.txt", UTF_8));
             BufferedWriter bw = new BufferedWriter(new FileWriter
                     ("out" + File.separator + "newtext.txt", Charset.forName("Windows-1251")))) {
            String s;
            while (( s = br.readLine() ) != null) {
                System.out.println(s);
                bw.write(s + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}