package ru.kondratyev.task19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Formatter;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Check {

    private static String[] products;

    public static void getScanner(String path) throws FileNotFoundException {
        FileReader fr = new FileReader(path);
        Scanner scanner = new Scanner(fr);
        int i = 0;
        products = new String[24];
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            products[i] = ( scanner.next() );
            i++;
        }
        scanner.close();
    }


    public static void main(String[] args) {
        try {
            getScanner("resource" + File.separator + "products.txt");
        /*(FileReader fr = new FileReader("resource" + File.separator + "products.txt")) {
            Scanner scanner = new Scanner(fr);
            int i = 0;
            String[] products = new String[24];
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                products[i] = ( scanner.next() );
                i++;
            }*/
            //scanner.close();

            Formatter f = new Formatter("out" + File.separator + "out.txt");
            f.format("%-20s%-10s%-15s%-10s\n", "Наименование", "Цена", "Количество", "Стоимость");
            f.flush();
            f.format("======================================================\n");
            f.flush();
            BigDecimal total = BigDecimal.valueOf(0);
            for (int y = 0; y < products.length; y += 3) {
                BigDecimal summa = BigDecimal.valueOf(( parseDouble(products[y + 1]) ) * ( parseDouble(products[y + 2]) ));
                f.format("%1$-20s%4$-7s%3$s%2$-15s%5$-10.2f\n",
                        products[y], products[y + 1], "x  ", products[y + 2],
                        summa);
                total = total.add(summa).setScale(2, RoundingMode.HALF_DOWN);
            }
            f.flush();
            f.format("======================================================\n");
            f.flush();
            f.format("%-45s%-10.2f\n", "Итого", total);
            f.flush();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}

