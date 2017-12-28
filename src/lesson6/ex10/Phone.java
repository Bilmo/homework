package lesson6.ex10;


public class Phone {
    long number;
    String module;
    double weight;

    Phone(int n, String m, double w) {
        this(n, m);
        weight = w;
    }

    Phone(int n, String m) {
        number = n;
        module = m;
    }

    Phone() {
    }

    void info() {
        System.out.println("Модель: " + number + " Номер: " + module + " Вес: " + weight);
    }

    void receiveCall(String name) {
        System.out.println("Имя звонящего - " + name);
    }

    void receiveCall(String name, int number) {
        System.out.println("Имя звонящего - " + name + '\n' + "Номер телефона: " + number);
    }

    void sendMassage(String... array) {
        for (String a : array) {
            System.out.println("Номера телефонов кому будет отправлено сообщение: " + a);
        }
        System.out.println();
    }
}