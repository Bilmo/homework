package ex5;

public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Пошло " + i++ * 5);
        }
        while (i > 0 && i * 5 < 101);
    }
}