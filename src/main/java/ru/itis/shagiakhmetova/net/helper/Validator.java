package ru.itis.shagiakhmetova.net.helper;

public class Validator {

    public static boolean checkLogin(String login) {
        return login.matches("^[a-z0-9_-]{3,15}$");
    }
    public static boolean checkPassword(String password) {
        return password.matches("(?=.*\\d+.*)(?=.*[A-Z]+.*)\\w{4,12}");
    }
}
