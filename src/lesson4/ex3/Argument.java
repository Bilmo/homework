package lesson4.ex3;


public class Argument {
    public static void main(String[] args) {
        int i1 = 0;
        double d2 = 0.0;
        for (String doubl : args) {
            double d1 = Double.parseDouble(doubl);
            d2 = d2 + d1;
            i1++;
        }
        double d3 = d2 / i1;
        System.out.println(d3);
    }
}