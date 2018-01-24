package lesson10;

public class Skirt extends Closes implements WomanDress {
    @Override
    public void wearWoman() {
    }

    public Skirt(Dresses size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Skirt{} " + super.toString();
    }
}
