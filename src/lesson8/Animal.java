package lesson8;


import java.io.Serializable;

public abstract class Animal implements Serializable {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public static void main(String[] args) {
        Animal[] animals = {new Cat("Кот кушает", "1"), new Dog("Пёс кушает", "l"),
                new Horse("Конь кушает", "l3")};
        Veterinarian veterinarian = new Veterinarian();
        for (Animal a : animals) {
            veterinarian.treatAnimal(a);
        }
    }

    public abstract void makeNoise();

    public abstract void eat();

    public void sleep() {
        System.out.println("спит");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}