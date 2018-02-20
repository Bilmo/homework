package lesson10;

public class InstrumentsDemo {
    public static void main(String[] args) {
        Instruments [] instruments = new Instruments[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drums(4.5);
        instruments[2] = new Trumpet(2.5);
        for (Instruments instruments1:instruments){
            instruments1.play();
        }
    }
}
