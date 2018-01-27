package lesson8;

import java.util.Objects;

public class Tulips extends Flower {
    private double height;

    public Tulips(String country, int dateExp, double price, double height) {
        super(country, dateExp, price);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tulips tulips = (Tulips) o;
        return Double.compare(tulips.height, height) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return "Tulips{" +
                "height=" + height +
                '}';
    }
}
