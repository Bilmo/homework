package lesson5.ex1;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        if (sc.hasNextInt()) {
            int i1 = sc.nextInt();
            if (i1 >= 0 && i1 <= 10) {
                System.out.println("Вы ввели положительное число");
            } else {
                System.out.println("Вы ввели отрицательное число или число больше 10");
            }
        }
    }
}