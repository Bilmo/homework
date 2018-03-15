package lesson13;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MyBirthDate {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(1994, 9, 11);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.forLanguageTag("UK"));
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
