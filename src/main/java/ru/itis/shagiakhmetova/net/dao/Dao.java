package ru.itis.shagiakhmetova.net.dao;

import ru.itis.shagiakhmetova.net.model.User;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    List<T> getAll();
    void save(T t);
    T get(int id);
    public User findByLogin(String login);
    public User findByLoginAndPassword(String login, String password);
}
