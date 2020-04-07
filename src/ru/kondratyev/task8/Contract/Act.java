package ru.kondratyev.task8.Contract;

public class Act {
    private int number;
    private String date;
    private String[] list;

    {
        list = new String[3];
    }

    public void setND(int n, String d) {
        number = n;
        date = d;
    }

    public void setND(String l1, String l2, String l3) {
        list[0] = l1;
        list[1] = l2;
        list[2] = l3;
    }


    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String[] getList() {
        return list;
    }
}
