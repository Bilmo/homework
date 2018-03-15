package lesson8;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Food: " + animal.getFood() + "      Location:" + animal.getLocation());
    }
}