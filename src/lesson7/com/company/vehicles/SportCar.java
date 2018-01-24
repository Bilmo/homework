package lesson7.com.company.vehicles;

import lesson7.com.company.details.Engine;
import lesson7.com.company.professions.Driver;

public class SportCar extends Car {
    private double speed;


    public SportCar(String marka, String carClass, double weight, Driver driver, Engine engine, double speed) {
        super(marka, carClass, weight, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }
}