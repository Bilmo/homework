package lesson7;


public class Phone {
    private long number;
    private String module;
    private double weight;
    private static int count;

    public Phone (int n, String m, double w) {
        this(n, m);
        weight = w;
    }

    public Phone(int n, String m) {
        number = n;
        module = m;
        count++;
    }

    public Phone() {
        count++;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setModule(String module) {

        this.module = module;
    }

    public long getNumber() {


        return number;
    }

    public String getModule() {

        return module;
    }

    public long getNumber(long n) {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void info() {
        System.out.println("Модель: " + number + " Номер: " + module + " Вес: " + weight);
    }

    public void receiveCall(String name) {
        System.out.println("Имя звонящего - " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Имя звонящего - " + name + '\n' + "Номер телефона: " + number);
    }

    public void sendMassage(String... array) {
        for (String a : array) {
            System.out.println("Номера телефонов кому будет отправлено сообщение: " + a);
        }
        System.out.println();
    }

    public static int getCount() {
        return count;
    }

    protected void finalize() {
        System.out.println("Конец");
        count--;
    }
}