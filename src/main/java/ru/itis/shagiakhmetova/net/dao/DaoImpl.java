package ru.itis.shagiakhmetova.net.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.itis.shagiakhmetova.net.helper.PostgresConnectionHelper;
import ru.itis.shagiakhmetova.net.model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements Dao<User> {

    public static final Logger LOGGER = LoggerFactory.getLogger(DaoImpl.class);
    private final Connection connection = PostgresConnectionHelper.getConnection();

    @Override
    public List<User> getAll() {
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from users;";
            ResultSet resultSet = statement.executeQuery(sql);
            List<User> users = new ArrayList<>();
            while (resultSet.next()) {
                User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("login"),
                        resultSet.getString("password"),
                        resultSet.getString("phone_number"),
                        resultSet.getString("faculty_name")
                );
                users.add(user);
            }
            return users;
        } catch (SQLException throwables) {
            LOGGER.warn("Failed execute findAll query.", throwables);
            return new ArrayList<>();
        }
    }

    @Override
    public User get(int id) {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM users;";
            ResultSet resultSet = statement.executeQuery(sql);

            User user = null;

            while (resultSet.next()) {
                if(resultSet.getInt("id") == id) {
                    user = new User(
                            resultSet.getInt("id"),
                            resultSet.getString("first_name"),
                            resultSet.getString("last_name"),
                            resultSet.getString("login"),
                            resultSet.getString("password"),
                            resultSet.getString("phone_number"),
                            resultSet.getString("faculty_name"));
                }
            }

            return user;
        } catch (SQLException throwables) {
            LOGGER.warn("Failed execute get query.", throwables);
            return null;
        }
    }

    @Override
    public void save(User user) {
        String sql = "insert into users" +
                "  (first_name, last_name, login, password, phone_number, faculty_name) VALUES " +
                " ( ?, ?, ?, ?,?,?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getLogin());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getPhone());
            preparedStatement.setString(6, user.getFaculty_name());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            LOGGER.warn("Failed to save new user.", throwables);
        }
    }
    @Override
    public User findByLogin(String login) {
        try {
            String sql = "SELECT * FROM users where login = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, login);
            ResultSet resultSet = preparedStatement.executeQuery();
            User user = null;

            while (resultSet.next()) {
                if(resultSet.getString("login").equals(login)) {
                    user = new User(
                            resultSet.getInt("id"),
                            resultSet.getString("first_name"),
                            resultSet.getString("last_name"),
                            resultSet.getString("login"),
                            resultSet.getString("password"),
                            resultSet.getString("phone_number"),
                            resultSet.getString("faculty_name"));
                }
            }

            return user;
        } catch (SQLException throwables) {
            LOGGER.warn("Failed execute get query.", throwables);
            return null;
        }
    }
    @Override
    public User findByLoginAndPassword(String login, String password) {
        try {
            String sql = "SELECT * FROM users where login = ? and password = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            User user = null;
            while (resultSet.next()) {
                if(resultSet.getString("login").equals(login) && resultSet.getString("password").equals(password)) {
                    user = new User(
                            resultSet.getInt("id"),
                            resultSet.getString("first_name"),
                            resultSet.getString("last_name"),
                            resultSet.getString("login"),
                            resultSet.getString("password"),
                            resultSet.getString("phone_number"),
                            resultSet.getString("faculty_name"));
                }
            }

            return user;
        } catch (SQLException throwables) {
            LOGGER.warn("Failed execute get query.", throwables);
            return null;
        }
    }

    public void changeLogin(int id, String login) {
        String sql = "UPDATE users SET login = ? WHERE users.id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, login);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            LOGGER.warn("Failed to update user.", throwables);
        }
    }

    public void changePassword(int id, String password) {
        String sql = "UPDATE users SET password = ? WHERE users.id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, password);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            LOGGER.warn("Failed to update user.", throwables);
        }
    }
}
