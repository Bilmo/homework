package lesson12;

public class StringTask {
    public static void main(String[] args) {
        doString("I like Java");
        doString("I like 1638!!!");
    }

    public static void doString(String s1) {
        System.out.println(s1.endsWith("Java"));
        System.out.println(s1.startsWith("I"));
        System.out.println(s1.startsWith("like"));
        System.out.println(s1.charAt(s1.length() - 1));
        System.out.println("IndexOf(Java) = " + s1.indexOf("Java"));
        System.out.println("LastIndexOf(Java) = " + s1.lastIndexOf("Java"));
        System.out.println(s1.replaceAll("a", "o"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(9));
    }
}
