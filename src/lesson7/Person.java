package lesson7;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public void move() {
        System.out.println(fullName + " " + age + " лет - идет");
    }

    public void talk() {
        System.out.println(fullName + " " + age + " лет - говорит");
    }
}
