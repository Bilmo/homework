package lesson3.ex2;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        int number;
        Scanner sr = new Scanner(System.in);
        System.out.print("Введите целое число -> ");
        if (sr.hasNextInt()) {
            number = sr.nextInt();
            System.out.println(((number & 1) == 0 ? "Четное число "
                    : "Не четное число ") + number);
        } else {
            System.out.print("Вы ввели не целое число");
        }
    }
}