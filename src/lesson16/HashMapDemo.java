package lesson16;

import java.util.*;

/**
 * Created by student on 2/18/2018.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new TreeMap<>();
        map.put("Кукла", new Toy("Кукла", 105));
        map.put("Кубик", new Toy("Кубик", 106));
        map.put("Машина", new Toy("Машина", 104));
        map.put("Юла", new Toy("Юла", 109));

        SortedMap<String, Toy> sortedMap = new TreeMap<>(map);

        iterateByEntry(map);
        iterateByKey(map);
        iterateByValue(map);
    }

    public static void iterateByEntry(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> set = map.entrySet();
        for (Map.Entry<String, Toy> entry : set) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
    }

    public static void iterateByKey(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " ");
            System.out.println(map.get(key));
        }
    }

    public static void iterateByValue(Map<String, Toy> map) {
        Collection<Toy> values = map.values();
        for (Toy toy : values) {
            System.out.println(toy);
        }
    }
}
