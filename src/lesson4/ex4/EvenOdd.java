package lesson4.ex4;

public class EvenOdd {

    public static void main(String[] args) {
        String str = args.length > 0 ? args[0] : "Ошибка";
        int i = Integer.parseInt(str);
        if (i % 2 != 1) {

        } else {
            System.out.println(i + " - нечетное число ");
        }
    }
}