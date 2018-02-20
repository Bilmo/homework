package lesson14;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;

    }

    @Override
    public int hashCode() {
        int result = login != null ? login.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public class Query {

        public void printToLog() {
            System.out.println("Пользователь с " + login + " " + password + " отправил запрос");
        }
    }


    public void creatQuery() {
        Query query1 = new Query();
        query1.printToLog();
    }

    public static void main(String[] args) {
        User user1 = new User("admin", "password");
        user1.creatQuery();
        User.Query query1 = user1.new Query();
        query1.printToLog();
        User.Query query2 = new User("admin2", "password2").new Query();
        query2.printToLog();
    }
}
