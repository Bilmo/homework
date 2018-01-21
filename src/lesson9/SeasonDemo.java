package lesson9;

/**
 * Created by student on 1/21/2018.
 */
public class SeasonDemo {
    public static void main(String[] args) {
        Season myFavSeason = Season.SUMMER;
        System.out.println(myFavSeason);
        printSeason(myFavSeason);
        printAllValues();
    }

    public static void printSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я не люблю мороз, температура " + season.getTemp());
                break;
            case SPRING:
                System.out.println("Хороша чертовка , температура " + season.getTemp());
                break;
            case SUMMER:
                System.out.println("Лето топ, температура " + season.getTemp());
                break;
            case AUTUM:
                System.out.println("Я люлю осень, температура " + season.getTemp());
                break;
            default:
                System.out.println("Неправильный ввод");
        }
    }

    public static void printAllValues() {
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season + " " + season.getDescription() + " " + season.ordinal() + " " + season.getTemp());
        }
    }
}
