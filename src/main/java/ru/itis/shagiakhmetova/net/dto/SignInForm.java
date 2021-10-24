package ru.itis.shagiakhmetova.net.dto;


public class SignInForm {
    private String login;
    private String password;

    public SignInForm(String login, String password) {
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

    public SignInForm(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "SignInForm{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
