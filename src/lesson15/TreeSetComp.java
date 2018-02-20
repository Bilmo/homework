package lesson15;

import lesson8.Animal;

import java.util.Set;;
import java.util.TreeSet;

public class TreeSetComp {
    public static void main(String[] args) {
        Set<Animal> set = new TreeSet<>();
        set.add(new Animal("A", "B"));
        set.add(new Animal("D", "B"));
        set.add(new Animal("C", "B"));
        set.add(new Animal("B", "B"));

        for (Animal animal : set) {
            System.out.println(animal);
        }
    }
}
