package lesson20;

/**
 * Created by student on 2/25/2018.
 */
public class NewThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("A " + i + Thread.currentThread().getName());
        }
    }
}
