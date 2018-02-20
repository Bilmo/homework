package lesson15;

import lesson8.Animal;

import java.util.Deque;

public class ArrayDeque {
    public static void main(String[] args) {
        Deque<Animal> animals = new java.util.ArrayDeque<>();
        animals.offer(new Animal("S", "B"));
        animals.offer(new Animal("F", "B"));
        animals.offer(new Animal("J", "B"));
        animals.offer(new Animal("D", "B"));

        while (animals.size() != 0) {
            System.out.println(animals.poll());
        }
    }
}
