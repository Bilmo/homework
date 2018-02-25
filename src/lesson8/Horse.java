package lesson8;

import lesson18.Halter;

import java.io.Serializable;
import java.util.Objects;

public class Horse extends Animal implements Serializable {
    private int weight;
    private Halter halter;

    public Halter getHalter() {
        return halter;
    }

    public void setHalter(Halter halter) {
        this.halter = halter;
    }

    public Horse(Halter halter, Halter halter1) {

        this.halter = halter1;
    }

    public Horse() {

    }

    @Override
    public int compareTo(Animal o) {
        return super.compareTo(o);
    }

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
