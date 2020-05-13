package ru.kondratyev.task21;

import java.util.Arrays;

public class Revers {

    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < ( array.length / 2 ); i++) {
            swap(array, i, array.length - 1 - i);
        }
        System.out.println(Arrays.toString(array));
    }
}
