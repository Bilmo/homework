package lesson6.ex10;

public class PhoneObj {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.number = 6354695;
        myPhone.module = "LG";
        myPhone.weight = 222.3;
        Phone myPhone2 = new Phone(6354695, "Xoxo", 222.6);
        Phone myPhone3 = new Phone(6354695, "Acer");
        myPhone.info();
        myPhone2.info();
        myPhone3.info();
        myPhone.receiveCall("Jon");
        myPhone2.receiveCall("Jon");
        myPhone3.receiveCall("Jon");
        myPhone.receiveCall("Molly", 6354695);
        myPhone2.receiveCall("Molly", 6354695);
        myPhone3.receiveCall("Molly", 6354695);
        myPhone.sendMassage("858694");
        myPhone2.sendMassage("867575", "858585");
        myPhone3.sendMassage("78575785", "785785785", "785785785");
    }
}