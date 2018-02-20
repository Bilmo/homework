package lesson14;

public class User2 {
    private String login;
    private String password;

    public User2(String login, String password) {
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

        User2 user2 = (User2) o;

        if (login != null ? !login.equals(user2.login) : user2.login != null) return false;
        return password != null ? password.equals(user2.password) : user2.password == null;

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


    public void creatQuery(String name) {
        class Query {
            public void printToLog() {
                System.out.println("Пользователь с " + login + " " + password + " отправил запрос" + name);
            }
        }
        Query query1 = new Query();
        query1.printToLog();
    }

    public static void main(String[] args) {
        User user1 = new User("admin", "password");
        user1.creatQuery();
    }
}
