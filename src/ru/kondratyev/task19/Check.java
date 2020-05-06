package ru.kondratyev.task19;

import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

import static java.lang.Double.parseDouble;


public class Check {

    public static void main(String args[]) {
        try (FileReader fr = new FileReader("D:\\NewFolder\\products.txt")) {
            Scanner scanner = new Scanner(fr);
            int i = 0;
            String[] products = new String[24];
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                products[i] = ( scanner.next() );
                i++;
            }
            scanner.close();
            Formatter f = new Formatter("D:\\NewFolder\\out.txt");
            f.format("%-20s%-10s%-15s%-10s\n", "Наименование", "Цена", "Количество", "Стоимость");
            f.flush();
            f.format("======================================================\n");
            f.flush();
            double total = 0.0;
            for (int y = 0; y < products.length; y += 3) {
                f.format("%1$-20s%4$-7s%3$s%2$-15s%5$-10.2f\n",
                        products[y], products[y + 1], "x  ", products[y + 2],
                        ( parseDouble(products[y + 1]) ) * ( parseDouble(products[y + 2]) ));
                total = total + ( ( parseDouble(products[y + 1]) ) * ( parseDouble(products[y + 2]) ) );
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
