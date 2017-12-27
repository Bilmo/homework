package ex6;

import java.util.Arrays;

public class BubbleChang {
    public static void main(String[] args) {
        int[] num = {0, 5, 3, 2, 4};
        int i, j, tmp;
        for (i = 0; i < num.length; i++) {
            for (j = num.length - 1; j > i; j--) {
                if (num[j - 1] < num[j]) {
                    tmp = num[j - 1];
                    num[j - 1] = num[j];
                    num[j] = tmp;
                }
            }
            System.out.println(Arrays.toString(num));
        }
    }
}

