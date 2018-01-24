package lesson10;

public class Tie extends Closes implements ManDress {
    @Override
    public void wearMan() {
        System.out.println("Одеваю галстук");
    }

    public Tie(Dresses size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }
}
