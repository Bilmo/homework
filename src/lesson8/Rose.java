package lesson8;

import java.util.Objects;

public class Rose extends Flower {
    private double weight;

    public Rose(String country, int dateExp, double price, double weight) {
        super(country, dateExp, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rose rose = (Rose) o;
        return Double.compare(rose.weight, weight) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "weight=" + weight +
                '}';
    }
}
