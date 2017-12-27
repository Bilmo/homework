package ex3;

import java.util.Scanner;

public class Scan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1, s2;
        System.out.println("Введите числа ->");
        if (sc.hasNextInt()) {
            s1 = sc.nextInt();
            s2 = sc.nextInt();
            System.out.println(s1 + s2);
        } else {
            System.out.println("Некорректное число");
        }
    }
}