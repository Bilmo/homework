package lesson8;

import java.util.Objects;

public class Horse extends Animal {
    private int weight;

    public Horse(String food, String location, int weight) {
        super(food, location);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return weight == horse.weight;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Ржет");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Ест овёс");
    }
}
