package lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaVer {
    public static void main(String[] args) {
        String regex = "Java\\s+\\d";
        String s = "Versions: Java 5, Java 6, Java 7, Java 8";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("e-mail: " + matcher.group());
        }
    }
}
