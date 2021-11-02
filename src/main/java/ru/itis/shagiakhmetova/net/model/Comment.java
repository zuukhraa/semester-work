package ru.itis.shagiakhmetova.net.model;

public class Comment {
    private int id;
    private int article_id;
    private int user_id;
    private String content;
    private String creation_data;

    public Comment(int id, int article_id, int user_id, String content, String creation_data) {
        this.id = id;
        this.article_id = article_id;
        this.user_id = user_id;
        this.content = content;
        this.creation_data = creation_data;
    }

    public Comment(int article_id, int user_id, String content, String creation_data) {
        this.article_id = article_id;
        this.user_id = user_id;
        this.content = content;
        this.creation_data = creation_data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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
}