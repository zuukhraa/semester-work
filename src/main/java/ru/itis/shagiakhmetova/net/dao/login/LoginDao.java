package ru.itis.shagiakhmetova.net.dao.login;

import ru.itis.shagiakhmetova.net.model.User;

import java.sql.*;

public class LoginDao {
    public boolean validate(User user) throws ClassNotFoundException {
        boolean status = false;

        Class.forName("org.postgresql.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/university_database", "postgres", "qwerty007");

             PreparedStatement preparedStatement = connection.prepareStatement("select * from users where login = ? and password = ? ")) {
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
}
