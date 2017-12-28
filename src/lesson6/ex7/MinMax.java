package lesson6.ex7;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 8, 6, 1, 7, 9, 11, 4},
                {12, 3, 1, 9, 11, 7, 6, 2},
                {3, 6, 8, 1, 4, 2, 45, 11},
                {23, 19, 8, 40, 7, 6, 34, 82},
                {6, 42, 32, 75, 94, 10, 75, 35}};
        multiDimOut(arr);
        System.out.println('\n');
        minMax(arr);
    }

    public static void minMax(int[][] arr) {
        int[][] minMax = new int[arr.length][2];
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                } else if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            minMax[i][0] = min;
            minMax[i][1] = max;
            min = max = arr[i][0];
        }
        multiDimOut(minMax);
    }

    public static void multiDimOut(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }
}