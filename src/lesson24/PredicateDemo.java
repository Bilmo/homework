package lesson24;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<String> isNotNull = s -> s != null;
        System.out.println(isNotNull.test(null));
        System.out.println(isNotNull.test("abc"));

        Predicate<String> isNotEmty = s -> !s.isEmpty();
        System.out.println(isNotEmty.test(""));
        System.out.println(isNotEmty.test("abc"));

        Predicate<String> predicate = isNotNull.and(isNotEmty);
        System.out.println(predicate.test(null));
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("asas"));
    }
}
