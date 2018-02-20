package lesson15;

import lesson8.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorAnimal {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(new Animal("Молоко", "Поле"));
        list.add(new Animal("Корм", "Лес"));
        list.add(new Animal("Мясо", "Луг"));
        list.add(new Animal("Трава", "Лес"));
        System.out.println(getAnimal(list));
        System.out.println();
        System.out.println(list);
    }

    public static List<Animal> getAnimal(List<Animal> list) {
        List<Animal> result = new ArrayList<>();
        Iterator<Animal> iterator = list.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal.getLocation().equals("Лес")) {
                iterator.remove();
                result.add(animal);
            }
        }
        return result;
    }
}
