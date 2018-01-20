package lesson7;

public class PersonOdd {
    public static void main(String[] args) {
        Person myPerson1 = new Person();
        Person myPerson2 = new Person("Василий Уткин", 18);
        myPerson1.move();
        myPerson1.talk();
        myPerson2.move();
        myPerson2.talk();
    }
}
