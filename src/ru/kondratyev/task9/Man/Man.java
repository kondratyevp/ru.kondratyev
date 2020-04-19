package ru.kondratyev.task9.Man;

abstract class Man implements Runnable, Swimmable {
    int time;

    public int getTime() {
        return time;
    }
}
