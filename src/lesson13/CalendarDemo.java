package lesson13;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(1999, 5, 9);
        System.out.println(calendar.getTime());
        System.out.println("Месяц " + calendar.get(Calendar.MONTH));
        System.out.println("Год " + calendar.get(Calendar.YEAR));
        System.out.println("Неделя в месяце "
                + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Неделя в году "
                + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("День в году " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("День в месяце "
                + calendar.get(Calendar.DAY_OF_MONTH));
        Date date = new Date(1999, 5, 9);
        System.out.println("Прожитые милисекунды - " + date.getTime());
        DateFormat dfa1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ENGLISH);
        DateFormat dfa2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.ENGLISH);
        DateFormat dfa3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.ENGLISH);
        DateFormat dfa4 = DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH);
        System.out.println(dfa1.format(calendar.getTime()));
        System.out.println(dfa2.format(calendar.getTime()));
        System.out.println(dfa3.format(calendar.getTime()));
        System.out.println(dfa4.format(calendar.getTime()));
    }
}
