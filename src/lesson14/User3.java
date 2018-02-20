package lesson14;

public class User3 {
    private static String login = "Admin";
    private static String password = "Password";

    public static String getLogin() {
        return login;
    }


    public static String getPassword() {
        return password;
    }


    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Query {

        public void printToLog() {
            System.out.println("Пользователь с " + login + " " + password + " отправил запрос");
        }
    }

    public static void main(String[] args) {
        User3.Query query1 = new User3.Query();
        query1.printToLog();

        Query query2 = new Query();
        query2.printToLog();
    }
}
