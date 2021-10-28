package ru.itis.shagiakhmetova.net.model;

public class Lecturer {
    private int id;
    private String firstName;
    private String lastName;
    private String date_of_birth;
    private String faculty_name;

    public Lecturer(int id, String firstName, String lastName, String date_of_birth, String faculty_name) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date_of_birth = date_of_birth;
        this.faculty_name = faculty_name;
    }

    public Lecturer(String firstName, String lastName, String date_of_birth, String faculty_name) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date_of_birth = date_of_birth;
        this.faculty_name = faculty_name;
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

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }
}
