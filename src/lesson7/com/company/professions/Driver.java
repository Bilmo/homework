package lesson7.com.company.professions;


public class Driver extends Person {
    int driving;

    public Driver() {

    }

    public Driver(String fullName) {
        super(fullName);
        this.driving = driving;
    }

    public int getDriving() {
        return driving;
    }

    public void setDriving(int driving) {
        this.driving = driving;
    }
}