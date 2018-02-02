package lesson4.ex1;

import java.util.Scanner;

public class TernaryMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1, i2, i3, c1, c2, c3;
        System.out.println("Введите числа");
        i1 = goScan(sc);
        i2 = goScan(sc);
        i3 = goScan(sc);
        c1 = i1 < 0 ? -i1 : i1;
        c2 = i2 < 0 ? -i2 : i2;
        c3 = i3 < 0 ? -i3 : i3;
        if (c1 < c2 && c1 < c3) {
            System.out.println(c1);
            System.out.println("Найменьший модуль");
        } else if (c2 < c1 && c2 < c3) {
            System.out.println(c2);
            System.out.println("Найменьший модуль");
        } else {
            System.out.println(c3);
            System.out.println("Найменьший модуль");
        }
    }
    public static int goScan(Scanner sc) {
        int i = 0;
        if (sc.hasNextInt()) {
            i = sc.nextInt();
        }
        return i;
    }
}