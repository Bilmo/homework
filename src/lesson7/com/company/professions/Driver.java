package lesson7.com.company.professions;

import lesson7.Person;

public class Driver extends Person {
    private double experience = 5.5;

    public Driver(String fullName, int age, double experience) {
        super(fullName, age);
        this.experience = experience;
    }

    public Driver() {
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                "} " + super.toString();
    }
}