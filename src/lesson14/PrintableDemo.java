package lesson14;

import lesson10.Printable;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Расширил");
            }
        };
        printable.print();
    }
}
