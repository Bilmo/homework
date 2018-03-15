package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Words {
    public static void main(String[] args) {
        String str = "Da 611 nope 41f2df same бой-";
        printLatinWords(str);
    }

    public static void printLatinWords(String str) {
        String regex = "[a-zA-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}