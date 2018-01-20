package lesson7.com.company.vehicles;

import lesson7.com.company.details.Engine;
import lesson7.com.company.professions.Driver;

public class SportCar extends Car {
    private double speed;


    public SportCar(String marka, String carClass, double weight, Driver driver, Engine engine) {
        super(marka, carClass, weight, driver, engine);
        this.speed = speed;
    }
}
