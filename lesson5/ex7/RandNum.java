package ex7;

public class RandNum {
    public static void main(String[] args) {
        int ranD = (int) (Math.random() * 5);
        System.out.println(ranD + " != " + factor(ranD));
    }

    public static int factor(int i) {
        int n = 1;
        for (int i1 = 1; i1 <= i; i1++) {
            n = n * i1;
        }
        return n;
    }
}