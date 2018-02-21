package lesson17;

public class AuthenticateDemo {
    public static void main(String[] args) {
        System.out.println(isAuthenticated("login1", "password1", "password1"));
        System.out.println(isAuthenticated("login1", "passwordasdasdasd1a", "password2"));
        System.out.println(isAuthenticated("login1", "password1", "password435fdgt6r52"));
        System.out.println("Конец");
    }

    public static boolean isAuthenticated(String login, String password, String confPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Неправильный логин");
            }
            if (password.length() > 20 || !password.equals(confPassword)) {
                throw new WrongPasswordException("Неправильный пароль");
            }
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.printf("Логин %s, пароль %s, потв. пароль %s", login, password, confPassword);
        }
        return true;
    }
}
