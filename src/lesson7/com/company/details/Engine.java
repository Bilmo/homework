package lesson7.com.company.details;

public class Engine {
    private int power = 444;
    private String company = "Siemens";

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    public Engine() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}