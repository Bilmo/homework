package lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhilosophersDemo {
    public static synchronized void main(String[] args) {
        List<Thread> philosopherList = new ArrayList<>(Arrays.asList(Philosopher.create5PhilosopherThreads()));
        philosopherList.forEach(Thread::start);

    }
}
