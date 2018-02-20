package lesson9;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit apple1 = new Apple(156, 10, "Красные");
        Fruit apple2 = new Apple(236, 20, "Желтые");
        Fruit apple3 = new Apple(356, 30, "Зеленые");
        Fruit pear1 = new Pear(145, 50, "Зеленая");
        Fruit pear2 = new Pear(266, 100, "Желтая");
        Fruit apricot1 = new Apricot(356, 12, "Зеленые");
        Fruit apricot2 = new Apricot(426, 32, "Желтые");
        System.out.println("Цена фруктов всего - " + (apple1.getPrice() + apple2.getPrice() + apple3.getPrice()
                + pear1.getPrice() + pear2.getPrice() + apricot1.getPrice() + apricot2.getPrice()));
        System.out.println("Стоимость отдельно проданых яблок - " + (apple1.getPrice()
                + apple2.getPrice() + apple3.getPrice()));
        System.out.println("Стоимость отдельно проданых груш - " + (pear1.getPrice() + pear2.getPrice()));
        System.out.println("Стоимость отдельно проданых абрикос - " + (apricot1.getPrice() + apricot2.getPrice()));
        apple1.fruitsPrice();
        apple1.printManufacturerInfo();
        pear1.fruitsPrice();
        pear1.printManufacturerInfo();
        apricot1.fruitsPrice();
        apricot1.printManufacturerInfo();

    }
}