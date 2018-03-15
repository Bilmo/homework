package lesson13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(1994, 9, 11);
        System.out.println("День недели " + calendar.getTime());
        Date myBirth = calendar.getTime();
        System.out.println("День рожденья " + myBirth.getTime());
    }
}