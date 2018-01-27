package lesson8;

import java.util.Objects;

public class Dog extends Animal {
    private int age;

    public Dog(String food, String location, int age) {
        super(food, location);
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
        Dog dog = (Dog) o;
        return age == dog.age;
    }

    @Override
    public int hashCode() {

        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Лает");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Ест мясо");
    }
}
