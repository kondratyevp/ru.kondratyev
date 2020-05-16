package ru.kondratyev.task18;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import static java.nio.charset.Charset.forName;
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
        try (BufferedReader br = Files.newBufferedReader(Paths.get("out" + File.separator + "text.txt"), UTF_8);
             BufferedWriter bw = Files.newBufferedWriter(Paths.get
                     ("out" + File.separator + "newtext.txt"), ( forName("Windows-1251") ))) {
            char[] buffer = new char[256];
            int c;
            while (( c = br.read(buffer) ) > 0) {
                if (c < 256) {
                    buffer = Arrays.copyOf(buffer, c);
                }
                System.out.println(buffer);
                bw.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}