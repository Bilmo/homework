package lesson24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by student on 3/18/2018.
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> words = Arrays.asList(1, 3, 5, 7, 8, 0);
        Stream<Integer> stream1 = words.stream();
        System.out.println(stream1.count());

        Stream<Integer> stream2 = Stream.of(4, 6, 5, 6, 7, 8);
        stream2.forEach(System.out::print);
        System.out.println();

        Integer[] integers = {1, 2, 4, 5, 6, 7};
        Stream<Integer> stream3 = Stream.of(integers);
        stream3.filter(t -> t < 6).forEach(System.out::print);
    }
}