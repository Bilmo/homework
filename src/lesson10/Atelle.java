package lesson10;

public class Atelle {
    public static void main(String[] args) {
        Closes[] dresses = new Closes[4];
        dresses[0] = new TShirt(Dresses.XXS, 30.55, "Розовый");
        dresses[1] = new Shirt(Dresses.XS, 40.6, "Синий");
        dresses[2] = new Skirt(Dresses.S, 50.5, "Красный");
        dresses[3] = new Tie(Dresses.M, 60.4, "Голубой");
        wearMan(dresses);
        wearWoman(dresses);
    }

    public static void wearMan(Closes dresses[]) {
        for (Closes dress : dresses) {
            if (dress instanceof ManDress) {
                ((ManDress) dress).wearMan();
            }
        }
    }

    public static void wearWoman(Closes dresses[]) {
        for (Closes dress : dresses) {
            if (dress instanceof WomanDress) {
                ((WomanDress) dress).wearWoman();
            }
        }
    }
}
