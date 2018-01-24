package lesson7.com.company.vehicles;

import lesson7.com.company.details.Engine;
import lesson7.com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying = 800;


    public Lorry(String marka, String carClass, double weight, Driver driver, Engine engine, int carrying) {
        super(marka, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}