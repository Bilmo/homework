package lesson9;

import java.util.Objects;

public class Pear extends Fruit {
    private String color;

    public Pear(double weight, double price, String color) {
        super(weight, price);
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
        Pear pear = (Pear) o;
        return Objects.equals(color, pear.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Pear{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void fruitsPrice() {
        System.out.println("Вес груши " + getWeight() + " грамм " + " стоит " + getPrice() +  " ru ");
    }
}
