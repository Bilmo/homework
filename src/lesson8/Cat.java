package lesson8;

public class Cat extends Animal {

    public Cat(String food, String location) {
        super(food, location);
    }

    public void makeNoise() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println("Cat eating");
    }
}
