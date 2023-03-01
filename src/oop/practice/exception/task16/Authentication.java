package oop.practice.exception.task16;

public class Authentication {
    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("[A-Za-z0-9_]+") && login.length() > 20) {
                throw new WrongLoginException("Wrong login!");
            }
            if (!password.matches("[A-Za-z0-9_]+") && login.length() > 20 && !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Wrong password!");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
