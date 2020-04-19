package ru.kondratyev.task14;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class VendingAutomatLog {

    private final static Logger logo = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        LogManager.getLogManager().reset();
        logo.setLevel(Level.ALL);
        /*ConsoleHandler console = new ConsoleHandler();
        console.setLevel(Level.ALL);
        logo.addHandler(console);*/

        try {
            FileHandler file1 = new FileHandler("FileAutomat.log");
            file1.setLevel(Level.ALL);
            file1.setFormatter(new SimpleFormatter());
            logo.addHandler(file1);
        } catch (IOException e) {
            logo.log(Level.SEVERE, "File not working");
        }
        AutomatLog automat = new AutomatLog();
        automat.Menu();
        Scanner in = new Scanner(System.in);
        System.out.println("Внесите деньги ");
        automat.money = in.nextInt();
        automat.buyDrink();
    }
}