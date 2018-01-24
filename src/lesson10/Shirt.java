package lesson10;

public class Shirt extends  Closes implements ManDress, WomanDress {
    @Override
    public void wearMan() {
        System.out.println("Одеваю штаны");
    }

    @Override
    public void wearWoman() {
        System.out.println("Одеваю штаны");
    }

    public Shirt(Dresses size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Shirt{} " + super.toString();
    }
}
