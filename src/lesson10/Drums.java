package lesson10;

import java.util.Objects;

public class Drums implements Instruments {
    private double size;

    public Drums(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drums drums = (Drums) o;
        return Double.compare(drums.size, size) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return "Drums{" +
                "size=" + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет барабан с размером " + getSize());
    }
}
