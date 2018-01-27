package lesson8;

import java.util.Objects;

public class Cat extends Animal {
    private String color;

    public Cat(String food, String location, String color) {
        super(food, location);
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
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Мурчит");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Пьет молоко");
    }
}
