package ru.itis.shagiakhmetova.net.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.itis.shagiakhmetova.net.helper.PostgresConnectionHelper;
import ru.itis.shagiakhmetova.net.model.Lecturer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LecturerImpl implements LecturerDao {

    public static final Logger LOGGER = LoggerFactory.getLogger(DaoImpl.class);
    private final Connection connection = PostgresConnectionHelper.getConnection();
    @Override
    public List<Lecturer> getAll() {
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from lecturers";
            ResultSet resultSet = statement.executeQuery(sql);
            List<Lecturer> lecturers = new ArrayList<>();
            while (resultSet.next()) {
                Lecturer lecturer = new Lecturer(
                        resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("date_of_birth"),
                        resultSet.getString("faculty_name")
                );
                lecturers.add(lecturer);
            }
            return lecturers;
        } catch (SQLException throwables) {
            LOGGER.warn("Failed execute findAll query.", throwables);
            return new ArrayList<>();
        }
    }
}

