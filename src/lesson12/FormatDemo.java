package lesson12;

/**
 * Created by student on 1/28/2018.
 */
public class FormatDemo {
    public static void main(String[] args) {
        printString(" Васичкин ", 5, " физике ");
    }

    public static void printString(String fullName, int mark, String subject) {
        System.out.printf("%15s получил оценку %3d по %10s",
                fullName, mark, subject);
    }
}
