package ru.kondratyev.task21;

import java.util.Arrays;

public class ArrayToLeft {

    public static void toLeft(int[][] arr) {
        int i;
        int j = 0;
        for (i = 0; i < arr.length; i++) {
            for (j = 1; j < arr[i].length; j++) {
                arr[i][j - 1] = arr[i][j];
            }
            arr[i][arr[i].length - 1] = 0;
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, {3, 4, 5, 6, 7, 8, 9, 10, 11, 12}};
        toLeft(array);
    }
}
