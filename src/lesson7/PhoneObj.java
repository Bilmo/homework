package lesson7;

public class PhoneObj {
    public static void main(String[] args) {
        Phone myPhone1 = new Phone();
        myPhone1.setNumber(65489);
        myPhone1.setModule("LG");
        myPhone1.setWeight(121.5);
        Phone myPhone2 = new Phone(65554, "Mi", 123.5);
        Phone myPhone3 = new Phone(696143, "Xi");

        myPhone1.info();
        myPhone2.info();
        myPhone3.info();

        myPhone1.receiveCall("Mel");
        myPhone2.receiveCall("Mel");
        myPhone3.receiveCall("Mel");

        myPhone1.receiveCall("Jo", 56566);
        myPhone2.receiveCall("Jo", 66945);
        myPhone3.receiveCall("Jo", 456984);

        myPhone1.sendMassage("56566");
        myPhone2.sendMassage("66945", "456984");
        myPhone3.sendMassage("56566", "66945", "456984");
        System.out.println(Phone.getCount());
        System.gc();
    }
}