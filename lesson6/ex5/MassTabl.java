package ex5;

import java.util.Arrays;

public class MassTabl {
    public static void main(String[] args) {
        int[] num = {4, 2, 3, 7, 6};
        int i, j, tmp;
        for (i = 0; i < num.length; i++) {
            for (j = num.length - 1; j > i; j--) {
                if (num[j - 1] > num[j]) {
                    tmp = num[j - 1];
                    num[j - 1] = num[j];
                    num[j] = tmp;
                }
            }
            System.out.println(Arrays.toString(num));
        }
    }
}