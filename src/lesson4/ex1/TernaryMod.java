package lesson4.ex1;

import java.util.Scanner;

public class TernaryMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа");
        if (sc.hasNextInt()) {
            int i1, i2, i3, c1, c2, c3;
            i1 = sc.nextInt();
            i2 = sc.nextInt();
            i3 = sc.nextInt();
            c1 = (i1 < 0 ? -i1 : i1);
            c2 = (i2 < 0 ? -i2 : i2);
            c3 = (i3 < 0 ? -i3 : i3);
            if (c1 < c2 && c1 < c3) {
                System.out.println(c1);
            } else if (c2 < c1 && c2 < c3) {
                System.out.println(c2);
            } else {
                System.out.println(c3);
            }
        }
    }
}
