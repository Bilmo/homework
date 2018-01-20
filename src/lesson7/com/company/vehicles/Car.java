package lesson7.com.company.vehicles;

import lesson7.com.company.details.Engine;
import lesson7.com.company.professions.Driver;

public class Car {
    private String model;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String model, String carClass, double weight, Driver driver, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Старт!");
    }

    public void stop() {
        System.out.println("Стоп!");
    }

    public void turnRight() {
        System.out.println("Направо!");
    }

    public void turnLeft() {
        System.out.println("Налево!");
    }

    public void printInfo() {
        System.out.println("Модель - " + getModel());
        System.out.println("Класс - " + getCarClass());
        System.out.println("Вес - " + getWeight());
        System.out.println("Водитель - " + getDriver());
        System.out.println("Мотор - " + getEngine());
    }
}