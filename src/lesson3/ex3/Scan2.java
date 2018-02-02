package lesson3.ex3;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = goScanner(sc);
        int s2 = goScanner(sc);
        System.out.println(s1 + s2);
    }

    public static int goScanner(Scanner sc) {
        System.out.println("Введите целое число");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Вы некорректно ввели число");
            return 0;
        }
    }
}