package lesson15;

public class Product implements Comparable<Product> {
    private String name;
    private double price;
    private int rairing;

    public Product(String name, double price, int rairing) {
        this.name = name;
        this.price = price;
        this.rairing = rairing;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRairing() {
        return rairing;
    }

    public void setRairing(int rairing) {
        this.rairing = rairing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        if (rairing != product.rairing) return false;
        return name != null ? name.equals(product.name) : product.name == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + rairing;
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rairing=" + rairing +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.getRairing() != o.getRairing()) {
            return o.getRairing() - this.getRairing();
        } else {
            return this.getName().compareTo(o.getName());
        }
    }
}
