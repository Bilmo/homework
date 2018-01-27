package lesson8;

import java.util.Objects;

public class Carnation extends Flower {
    private String color;

    public Carnation(String country, int dateExp, double price, String color) {
        super(country, dateExp, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Carnation carnation = (Carnation) o;
        return Objects.equals(color, carnation.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Carnation{" +
                "color='" + color + '\'' +
                '}';
    }
}
