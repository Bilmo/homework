package lesson8;

import java.util.Objects;

public class Flower {
    private String country;
    private int dateExp;
    private double price;
    private static int count = 0;

    public Flower(String country, int dateExp, double price) {
        this.country = country;
        this.dateExp = dateExp;
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Flower.count = count;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDateExp() {
        return dateExp;
    }

    public void setDateExp(int dateExp) {
        this.dateExp = dateExp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return dateExp == flower.dateExp &&
                Double.compare(flower.price, price) == 0 &&
                Objects.equals(country, flower.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(country, dateExp, price);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "country='" + country + '\'' +
                ", dateExp=" + dateExp +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Flower[] bouquet1 = new Flower[2];
        bouquet1[0] = new Rose("USA", 2018, 236, 10.2);
        bouquet1[1] = new Carnation("UA", 2018, 110, "Blue");
        Flower[] bouquet2 = new Flower[3];
        bouquet2[0] = new Tulips("USA", 2018, 150, 100);
        bouquet2[1] = new Peonies("USA", 2018, 222, 1);
        bouquet2[2] = new Rose("USA", 2018, 236, 10.2);
        Flower[] bouquet3 = new Flower[4];
        bouquet3[0] = new Rose("USA", 2018, 236, 10.2);
        bouquet3[1] = new Carnation("UA", 2018, 110, "Blue");
        bouquet3[2] = new Tulips("USA", 2018, 150, 100);
        bouquet3[3] = new Peonies("USA", 2018, 222, 1);
        Flower.bouquetPrice(bouquet1);
        Flower.bouquetPrice(bouquet2);
        Flower.bouquetPrice(bouquet3);
        Flower.setCount(bouquet1.length + bouquet2.length + bouquet3.length);
        System.out.println("Продано цветов " + Flower.getCount());
    }

    public static void bouquetPrice(Flower[] bouquet) {
        double priceOfBouquet = 0.0;
        for (int i = 0; i < bouquet.length; i++) {
            priceOfBouquet += bouquet[i].getPrice();
        }
        System.out.println("Цена букета  : " + priceOfBouquet);
    }
}
