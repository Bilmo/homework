package lesson8;

import java.util.Objects;

public class Peonies extends Flower {
    private int age;

    public Peonies(String country, int dateExp, double price, int age) {
        super(country, dateExp, price);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Peonies peonies = (Peonies) o;
        return age == peonies.age;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), age);
    }

    @Override
    public String toString() {
        return "Peonies{" +
                "age=" + age +
                '}';
    }
}
