package lesson8;

public class Dog extends Animal {

    public Dog(String food, String location) {
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Woof");
    }

    public void eat() {
        System.out.println("Dog eating");
    }
}
