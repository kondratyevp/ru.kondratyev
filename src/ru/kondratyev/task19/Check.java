package ru.kondratyev.task19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Check {

    public static List<Product> getProducts(String path) throws FileNotFoundException {
        FileReader fr = new FileReader(path);
        Scanner scanner = new Scanner(fr);
        List<Product> products = new ArrayList<>();
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            products.add(new Product(scanner.next(), scanner.next(), scanner.next()));
        }
        scanner.close();
        return products;
    }

    public static void main(String[] args) {
        try {
            BigDecimal total = BigDecimal.valueOf(0);
            System.out.printf("%-20s%-10s%-15s%-10s\n", "Наименование", "Цена", "Количество", "Стоимость");
            System.out.print("======================================================\n");
            for (Product product : getProducts("resource" + File.separator + "products.txt")) {
                BigDecimal summa = BigDecimal.valueOf(( parseDouble(product.getPrice()) ) * ( parseDouble(product.getQuantity()) ));
                System.out.printf("%1$-20s%4$-7s%3$s%2$-15s%5$-10.2f\n",
                        product.getName(), product.getQuantity(), "x  ", product.getPrice(), summa);
                total = total.add(summa).setScale(2, RoundingMode.HALF_DOWN);
            }
            System.out.print("======================================================\n");
            System.out.printf("%-45s%-10.2f\n", "Итого", total);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}

