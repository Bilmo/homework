package lesson5.ex2;

public class Days {
    public static void main(String[] args) {
        for (String str : args) {
            String day = new String();
            if ("1".equals(str)) {
                day = "Понедельник";
            } else if ("2".equals(str)) {
                day = "Вторник";
            } else if ("3".equals(str)) {
                day = "Среда";
            } else if ("4".equals(str)) {
                day = "Четверг";
            } else if ("5".equals(str)) {
                day = "Пятница";
            } else if ("6".equals(str)) {
                day = "Выходной";
            } else if ("7".equals(str)) {
                day = "Выходной";
            }
            System.out.println("Сегодня " + day);
        }
    }
}
