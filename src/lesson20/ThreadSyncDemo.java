package lesson20;

public class ThreadSyncDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("A");

        ThreadSync thread1 = new ThreadSync(stringBuilder);
        ThreadSync thread2 = new ThreadSync(stringBuilder);
        ThreadSync thread3 = new ThreadSync(stringBuilder);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}