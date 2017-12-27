package ex3;

import java.util.Scanner;

public class Argument {
    public static void main(String[] args) {
        int i1 = 0;
        double d2 = 0.0;
        Scanner sc = new Scanner(System.in);
        for (String Doubl : args) {
            double d1 = Double.parseDouble(Doubl);
            d2 = d2 + d1;
            i1++;
        }
        double d3 = d2 / i1;
        System.out.println(d3);
    }
}