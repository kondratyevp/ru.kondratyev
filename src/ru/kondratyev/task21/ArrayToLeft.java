package ru.kondratyev.task21;

import java.util.Arrays;

public class ArrayToLeft {

    public static void toLeft(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j - 1] = arr[i][j];
            }
            arr[i][arr[i].length - 1] = 0;
        }

    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, {3, 4, 5, 6, 7, 8, 9, 10, 11, 12}};
        toLeft(array);
        System.out.println(Arrays.deepToString(array));
    }
}
