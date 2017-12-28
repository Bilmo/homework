package lesson5.ex3;

public class SwitchDay {
    public static void main(String[] args) {
        for (String str : args) {
            String day = new String();
            switch (str) {
                case ("1"):
                    day = "Понедельник";
                    break;
                case ("2"):
                    day = "Вторник";
                    break;
                case ("3"):
                    day = "Среда";
                    break;
                case ("4"):
                    day = "Четверг";
                    break;
                case ("5"):
                    day = "Пятница";
                    break;
                case ("6"):
                case ("7"):
                    day = "Выходной";
            }
            System.out.println("Хороший день " + day);
        }
    }
}
