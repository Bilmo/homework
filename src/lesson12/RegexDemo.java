package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by student on 1/28/2018.
 */
public class RegexDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c+ab");
        Matcher matcher = pattern.matcher("cab");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}