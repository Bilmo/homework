package lesson10;

public abstract class Closes {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Closes closes = (Closes) o;

        if (size != closes.size) return false;
        if (Double.compare(closes.price, price) != 0) return false;
        return color != null ? color.equals(closes.color) : closes.color == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = size != null ? size.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}