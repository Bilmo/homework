package lesson8;

import java.util.Objects;

public abstract class Flower {
    private static int cntrOfAllFlwrs = 0;
    private static int costOfAllFlwrs = 0;
    private String manufacturerCountry;
    private int shelfLife;
    private int cost;

    public Flower(String manufacturerCountry, int shelfLife, int cost) {
        this.manufacturerCountry = manufacturerCountry;
        this.shelfLife = shelfLife;
        this.cost = cost;
        cntrOfAllFlwrs++;
        costOfAllFlwrs += cost;
    }

    public static int getCntrOfAllFlwrs() {
        return cntrOfAllFlwrs;
    }

    public static int getCostOfAllFlwrs() {
        return costOfAllFlwrs;
    }

    public static void initRandomFlowers(Flower[][] flowers) {
        for (int i = 0; i < flowers.length; i++) {
            for (int j = 0; j < flowers[i].length; j++) {
                byte n = (byte) (Math.random() * 5);
                if (n <= 1) {
                    flowers[i][j] = new Carnation("Украина", 365 * 2, 25);
                } else if (n <= 2) {
                    flowers[i][j] = new Tulip("Украина", 450, 50);
                } else if (n <= 3) {
                    flowers[i][j] = new Rose("Украина", 365 * 2, 75, true);
                } else if (n <= 4) {
                    flowers[i][j] = new Middledames("Украина", 365 * 2, 100);
                }
            }
        }
    }

    public static void printFlowers(Flower[][] flowers) {
        int numOfBouquet = 1;
        for (Flower[] fl : flowers) {
            System.out.println("\nКол. букетов: " + numOfBouquet++);
            for (Flower f : fl) {
                System.out.println(
                        "\nИмя: " + f.printInfo() +
                                "\nСрок годности: " + f.getShelfLife() +
                                "\nСтрана изготовитель: " + f.getManufacturerCountry() +
                                "\nСтоимость: " + f.getCost());
            }
        }
        System.out.println("\n\nКол. проданных цветов: " + getCntrOfAllFlwrs());
        System.out.println("Стоимость проданных цветов: " + getCostOfAllFlwrs());
    }

    public static void main(String[] args) {
        Flower[][] flowers = new Flower[3][4];
        initRandomFlowers(flowers);
        printFlowers(flowers);
    }

    public abstract String printInfo();

    public void printPriceOfFlowers() {
        System.out.println(costOfAllFlwrs);
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife > 0 ? shelfLife : 0;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost > 0 ? cost : 0;
    }
}
