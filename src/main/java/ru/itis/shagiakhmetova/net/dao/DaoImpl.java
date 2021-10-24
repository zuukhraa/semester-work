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
    public boolean validate(User user) {
        boolean status = false;
        try {
        PreparedStatement preparedStatement = connection.prepareStatement("select * from users where login = ? and password = ?");
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
                System.out.println(preparedStatement);
                ResultSet rs = preparedStatement.executeQuery();
                status = rs.next();
        } catch (SQLException e) {
                printSQLException(e);
            }
            return status;
        }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    @Override
    public List<User> getAll() {
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from users";
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
            String sql = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(sql);

            User user = null;

            while (resultSet.next()) {
                if(resultSet.getInt("id") == id) {
                    user = new User(
                    resultSet.getInt("id"),
                            resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
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

    public User findByLogin(String login) {
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(sql);

            User user = null;

            while (resultSet.next()) {
                if(resultSet.getString("login").equals(login)) {
                    user = new User(
                            resultSet.getInt("id"),
                            resultSet.getString("first_name"),
                            resultSet.getString("last_name"),
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
        }


