package lesson7;


public class Person {
    int age;
    private String fullName;

    public Person() {

    }

    public Person(String aFullName, int anAge) {
        fullName = aFullName;
        age = anAge;
    }

    public static void main(String[] args) {
        new Person().move();
        new Person("Петро", 30).talk();
    }

    public void move() {
        System.out.println(fullName + " Идет ");
    }

    public void talk() {
        System.out.println((fullName + " Говорит "));
    }
}