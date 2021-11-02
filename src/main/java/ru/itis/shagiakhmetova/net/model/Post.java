package ru.itis.shagiakhmetova.net.model;

public class Post{
    private int id;
    private int user_id;
    private String title;
    private String content;
    private String creation_data;
    private String login;

    public Post(int id, int user_id, String title, String content, String creation_data, String login) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.content = content;
        this.creation_data = creation_data;
        this.login = login;
    }

    public Post(int user_id, String title, String content, String creation_data, String login) {
        this.user_id = user_id;
        this.title = title;
        this.content = content;
        this.creation_data = creation_data;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreation_data() {
        return creation_data;
    }

    public void setCreation_data(String creation_data) {
        this.creation_data = creation_data;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}