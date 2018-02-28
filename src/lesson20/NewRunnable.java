package lesson20;

/**
 * Created by student on 2/25/2018.
 */
public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            if (i % 10 == 0) {
                System.out.println(i + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
