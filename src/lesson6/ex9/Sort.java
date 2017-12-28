package lesson6.ex9;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = {5, 7, 9, 2, 6, 4, 3, 1, 66};
        sort(array);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            if (pos != i) {
                array[pos] = array[i];
                array[i] = min;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
