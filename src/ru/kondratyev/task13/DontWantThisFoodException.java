package ru.kondratyev.task13;

public class DontWantThisFoodException extends Exception {
    private static final String MESSAGE = "Не нравится";

    @Override
    public String getMessage() {
        return MESSAGE;
    }
}
