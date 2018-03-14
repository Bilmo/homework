package lesson24;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> newString = String::new;
        System.out.println(newString.get());
    }
}
