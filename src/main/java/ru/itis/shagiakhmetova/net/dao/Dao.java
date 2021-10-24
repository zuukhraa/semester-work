package ru.itis.shagiakhmetova.net.dao;

import ru.itis.shagiakhmetova.net.model.User;

import java.util.List;

public interface Dao<T> {
    List<T> getAll();
    void save(T t);
    User get(int id);
    boolean validate(T t);

}
