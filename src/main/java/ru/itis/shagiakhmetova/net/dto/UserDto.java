package ru.itis.shagiakhmetova.net.dto;

public class UserDto {
    private int id;
    private String firstName;
    private String lastName;
    private String login;
    private String hashPassword;
    private String phone;
    private String faculty_name;

    public UserDto(int id, String firstName, String lastName, String login, String password, String phone, String faculty_name) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.hashPassword = password;
        this.phone = phone;
        this.faculty_name = faculty_name;
    }

    public UserDto(String firstName, String lastName, String login, String password, String phone, String faculty_name) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.hashPassword = password;
        this.phone = phone;
        this.faculty_name = faculty_name;
    }

    public int getId() {
        return id;
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

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
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
