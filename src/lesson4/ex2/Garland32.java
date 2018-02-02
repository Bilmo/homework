package lesson4.ex2;

import java.util.Scanner;

public class Garland32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Включено лампочек - " + random());
        System.out.println("Выберите функцию:");
        System.out.println("1.Мигание лампочек");
        System.out.println("2.Бегущая строка");
        System.out.println("3.Проверка первой позиции");
        System.out.println("4.Проверка включена гирлянда или выключена");
        switch (goScan(sc)) {
            case 1:
                flashing(sc);
                break;
            case 2:
                runString(sc);
                break;
            case 3:
                firstPosition(sc);
                break;
            case 4:
                state();
                break;
        }
    }

    public static void flashing(Scanner sc) {
        System.out.println("Введите номер лампочки,которая должна мигать:");
        int garland = goScan(sc);
        System.out.println("Введите количество миганий лампочки");
        int amount = goScan(sc);
        for (int i = 0; amount > i; i++) {
            garland = ~garland;
            System.out.println(Integer.toBinaryString(garland));
        }
    }

    public static void runString(Scanner sc) {
        System.out.println("Введите номер лампочки,которая должна убежать:");
        int garland = goScan(sc);
        System.out.println("Введите количество шагов для побега");
        int amount = goScan(sc);
        for (int i = 0; amount > i; i++) {
            garland = garland << 1;
            System.out.println(Integer.toBinaryString(garland << 1));
        }
    }

    public static void firstPosition(Scanner sc) {
        System.out.println("Введите номер лампочки для проверки первой позиции:");
        int b;
        int i = goScan(sc);
        int maska = 1;
        b = i & maska;
        System.out.println("Первая позиция " + b);
    }

    public static void state() {
        int i = random();
        if (i > 0) {
            System.out.println("Гирлянда включена");
        } else {
            System.out.println("Гирлянда выключена");
        }
    }

    public static int random() {
        return (int) (Math.random() * 33);
    }

    public static int goScan(Scanner sc) {
        int i = 0;
        if (sc.hasNextInt()) {
            i = sc.nextInt();
        }
        return i;
    }
}