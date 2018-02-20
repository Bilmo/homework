package lesson8;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable, Comparable<Animal> {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }


    public Animal() {
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(food, animal.food) &&
                Objects.equals(location, animal.location);
    }

    @Override
    public int hashCode() {

        return Objects.hash(food, location);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public void makeNoise() {
        System.out.println("Делает звук");
    }

    public void eat() {
        System.out.println("Ест");
    }

    public void sleep() {
        System.out.println("Спит");
    }

    @Override
    public int compareTo(Animal o) {
        return food.compareTo(o.food);
    }
}
