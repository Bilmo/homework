package lesson7.com.company.vehicles;

import lesson7.com.company.details.Engine;
import lesson7.com.company.professions.Driver;

public class Car {
    private String marka;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String marka, String carClass, double weight, Driver driver, Engine engine) {
        this.marka = marka;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
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

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Engine engine1 = new Engine();
        Driver driver1 = new Driver();
        Car car = new Car("Chevrolet", "Sedan", 9.3, driver1, engine1);
        Lorry lorry = new Lorry("Chevrolet", "Sedan", 9.3, driver1, engine1, 333);
        SportCar sportCar = new SportCar("Chevrolet", "Sedan", 9.3, driver1, engine1, 777);
        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();
        car.printInfo();
        lorry.start();
        lorry.stop();
        lorry.turnLeft();
        lorry.turnRight();
        lorry.printInfo();
        System.out.println("Грузоподьемность - " + lorry);
        sportCar.start();
        sportCar.stop();
        sportCar.turnLeft();
        sportCar.turnRight();
        sportCar.printInfo();
        System.out.println("Скорость - " + sportCar);
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Модель - " + getMarka());
        System.out.println("Класс - " + getCarClass());
        System.out.println("Вес - " + getWeight());
        System.out.println("Водитель - " + getDriver());
        System.out.println("Двигатель - " + getEngine());
    }
}