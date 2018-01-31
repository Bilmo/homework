package lesson9;

import java.util.Objects;

public class CircleRPI {
    private int radius;
    private static final double PI = 3.14;

    public CircleRPI(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircleRPI circleRPI = (CircleRPI) o;
        return radius == circleRPI.radius;
    }

    @Override
    public int hashCode() {

        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "CircleRPI{" +
                "radius=" + radius +
                '}';
    }
    public static void main(String[] args) {
        CircleRPI circle1 = new CircleRPI(5);
        CircleRPI circle2 = new CircleRPI(10);
        CircleRPI circle3 = new CircleRPI(15);
        circle1.square();
        circle2.square();
        circle3.square();
        circle1.length();
        circle2.length();
        circle3.length();
    }


    public void square() {
        System.out.println("Площадь окружности равна  = " + ((radius * radius) * PI));
    }

    public void length() {
        System.out.println("Длина окружности равна = " + (2 * PI * radius));
    }
}
