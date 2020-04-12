package ru.kondratyev.task8.Contract;

import java.util.Arrays;

public class Act {
    private int number;
    private String date;
    private String[] list;

    public Act(int number, String date, String[] list) {
        this.number = number;
        this.date = date;
        this.list = list;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Act{" +
                "number=" + number +
                ", date='" + date + '\'' +
                ", list=" + Arrays.toString(list) +
                '}';
    }
}
