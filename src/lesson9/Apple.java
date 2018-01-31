package lesson9;

import java.util.Objects;

public class Apple extends Fruit {
    private String color;

    public Apple(double weight, double price, String color) {
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
        Apple apple = (Apple) o;
        return Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }

    @Override
    public void priceFruit() {
        System.out.println("Вес яблока " + getWeight() + " грамм " + " стоит " + getPrice() +  " ru ");
    }
}
