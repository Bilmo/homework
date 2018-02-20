package lesson15;


import java.util.Set;
import java.util.TreeSet;

public class Shop {
    public static void main(String[] args) {
        Set<Product> products1 = new TreeSet<>();
        products1.add(new Product("Платье", 1000, 5));
        products1.add(new Product("Джинсы", 600, 3));
        products1.add(new Product("Рубашка", 900, 4));
        products1.add(new Product("Брюки", 800, 3));
        Category category = new Category("Одежда", products1);
        Set<Product> products2 = new TreeSet<>(new ProductComparatorName());
        products2.addAll(products1);
        Set<Product> products3 = new TreeSet<>(new ProductComparatorPrice());
        products3.addAll(products1);

        print(products1);
        print(products2);
        print(products3);
    }

    public static void print(Set<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();
    }
}
