package lesson10;

public class Closes {
    private Dresses size;
    private double price;
    private String color;

    public Closes(Dresses size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Dresses getSize() {
        return size;
    }

    public void setSize(Dresses size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Closes{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
