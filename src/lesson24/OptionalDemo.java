package lesson24;

import java.util.Optional;

/**
 * Created by student on 3/18/2018.
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Integer> optional1 = Optional.empty();
        Optional<Integer> optional2 = Optional.of(5);
        Optional<Integer> optional3 = Optional.ofNullable(7);

        optional1.ifPresent(System.out::println);

        if (optional2.isPresent()) {
            System.out.println(optional2);
        }
        if (optional3.isPresent()) {
            System.out.println(optional3);
        }

        System.out.println(optional1.orElse(777));
        System.out.println(optional2.get());
        System.out.println(optional3.get());

        System.out.println(optional3.filter(t-> t > 8).orElse(888));
    }
}
