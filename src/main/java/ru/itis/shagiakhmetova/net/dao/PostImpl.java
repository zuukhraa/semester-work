package ru.itis.shagiakhmetova.net.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.itis.shagiakhmetova.net.helper.PostgresConnectionHelper;
import ru.itis.shagiakhmetova.net.model.Post;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostImpl implements PostDao {

    public static final Logger LOGGER = LoggerFactory.getLogger(PostImpl.class);
    private final Connection connection = PostgresConnectionHelper.getConnection();

    @Override
    public void save(Post post) {
        String sql = "insert into posts (user_id, title, content, creation_data, login) " +
                "VALUES (?, ?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, post.getUser_id());
            preparedStatement.setString(2, post.getTitle());
            preparedStatement.setString(3, post.getContent());
            preparedStatement.setString(4, post.getCreation_data());
            preparedStatement.setString(5, post.getLogin());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            LOGGER.warn("Failed to save new article.", throwables);
        }
    }

    @Override
    public List<Post> getAll() {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM posts";
            ResultSet resultSet = statement.executeQuery(sql);
            List<Post> posts = new ArrayList<>();
            while (resultSet.next()) {
                Post post = new Post(
                        resultSet.getInt("id"),
                        resultSet.getInt("user_id"),
                        resultSet.getString("title"),
                        resultSet.getString("content"),
                        resultSet.getString("creation_data"),
                        resultSet.getString("login")
                );
                posts.add(post);
            }
            return posts;
        } catch (SQLException throwables) {
            LOGGER.warn("Failed execute getAll query.", throwables);
            return new ArrayList<>();
        }
    }

    public List<Post> getById(int user_id) {
        try {
            String sql = "SELECT * FROM posts WHERE user_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user_id);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Post> posts= new ArrayList<>();
            while (resultSet.next()) {
                Post post = new Post(
                        resultSet.getInt("id"),
                        resultSet.getInt("user_id"),
                        resultSet.getString("title"),
                        resultSet.getString("content"),
                        resultSet.getString("creation_data"),
                        resultSet.getString("login")
                );
                posts.add(post);
            }
            return posts;
        } catch (SQLException throwables) {
            LOGGER.warn("Failed execute getAll query.", throwables);
            return new ArrayList<>();
        }
    }

    @Override
    public Post get(int id) {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM posts";
            ResultSet resultSet = statement.executeQuery(sql);
            Post post = null;
            while (resultSet.next()) {
                if(resultSet.getInt("id") == id) {
                    post = new Post(
                            resultSet.getInt("id"),
                            resultSet.getInt("user_id"),
                            resultSet.getString("title"),
                            resultSet.getString("content"),
                            resultSet.getString("creation_data"),
                            resultSet.getString("login")
                    );
                }
            }

            return post;
        } catch (SQLException throwables) {
            LOGGER.warn("Failed execute get query.", throwables);
            return null;
        }
    }
}
