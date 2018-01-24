package lesson10;

public class TShirt extends Closes implements ManDress, WomanDress {
    @Override
    public void wearMan() {
    }

    @Override
    public void wearWoman() {
    }

    public TShirt(Dresses size, double price, String color) {
        super(size, price, color);
    }

}
