package ru.kondratyev.task13;

public class DontWantThisFoodException extends Exception {
    private static final String MESSAGE = "Не нравится\nСпасибо мама";

    public DontWantThisFoodException() {
        super(MESSAGE);
    }
}
