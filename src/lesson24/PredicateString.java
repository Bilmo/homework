package lesson24;

import java.util.function.Predicate;

public class PredicateString {
    public static void main(String[] args) {
        Predicate<String> startWithJ = s -> s.startsWith("J");
        Predicate<String> startWithN = s -> s.startsWith("N");
        Predicate<String> endWithA = s -> s.endsWith("J");

        Predicate<String> or = startWithJ.or(startWithN);
        System.out.println(or.and(endWithA).test("Java"));
        System.out.println(or.and(endWithA).test("Nava"));
        System.out.println(or.and(endWithA).test("Navj"));
        System.out.println(or.and(endWithA).test("Lava"));
    }
}
