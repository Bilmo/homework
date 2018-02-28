package lesson20;

public class ThreadSync extends  Thread {
    private StringBuilder stringBuilder;

    public ThreadSync(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.print(stringBuilder);
            }
            System.out.println();
            char letter = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++letter);
        }
    }
}
