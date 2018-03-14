package lesson24;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> function = str -> {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException e) {
                return 0;
            }
        };
        System.out.println(function.apply("12"));
        System.out.println(function.apply("abc"));
    }
}
