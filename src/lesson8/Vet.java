package lesson8;

public class Vet {

    public static void main(String[] args) {
        Vet vets = new Vet();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("баранину", "в доме", 5);
        animals[1] = new Cat("рыбу", "в доме", "рыжий");
        animals[2] = new Horse("овёс", "в конюшне", 777);
        for (Animal animal : animals) {
            vets.treatAnimal(animal);
            animal.sleep();
        }
    }

    void treatAnimal(Animal animal) {
        System.out.println("Животное ест " + animal.getFood());
        System.out.println("Животное живет " + animal.getLocation());
    }
}