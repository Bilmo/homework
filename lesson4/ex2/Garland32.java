package ex2;

import java.util.Scanner;

public class Garland32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Текущее состояние " + random());
        System.out.println("Выберете функцию:");
        System.out.println("1. Мигание");
        System.out.println("2. Бегущая строка");
        System.out.println("3. Первая лампочка");
        System.out.println("4. Состояние гирлянды");
        if (sc.hasNextInt()) {

            switch (sc.nextInt()) {
                case 1:
                    blink();
                    break;
                case 2:
                    trink();
                    break;
                case 3:
                    lampOnOff();
                    break;
                case 4:
                    OnOff();
                    break;
            }
        }
    }

    public static void blink() {
        System.out.println("Номер мигающей лампочки");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int i3 = sc.nextInt();
            System.out.println("Колличество миганий");
            int i2 = sc.nextInt();
            for (int i1 = 0; i2 > i1; i1++)
                i3 = ~i3;
            System.out.println(Integer.toBinaryString(i3));
        }
    }

    private static void trink() {
        System.out.println("Бегущая строка");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            a = a << 1;
            i++;
            System.out.println(Integer.toBinaryString(a << 1));
        }
    }

    public static void lampOnOff() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Проверка первой лампочки");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            int maska = 1;
            int b;
            b = i & maska;
            System.out.println("Первая позиция " + b);
        }
    }

    public static void OnOff() {
        int i = random();
        if (i > 0 && i < 33) {
            System.out.println("Включена");
        } else {
            System.out.println("Выключена");
        }
    }

    public static int random() {
        return (int) (Math.random() * 33);
    }
}
