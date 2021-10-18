package ru.itis.shagiakhmetova.net.model;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String phone;
    private String faculty_name;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(int id, String firstName, String lastName, String login, String password, String phone, String faculty_name) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.phone = phone;
        this.faculty_name = faculty_name;
    }

    public User(String firstName, String lastName, String login, String password, String phone, String faculty_name) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.phone = phone;
        this.faculty_name = faculty_name;
    }

    public User() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }
}
