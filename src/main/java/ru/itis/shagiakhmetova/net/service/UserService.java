package ru.itis.shagiakhmetova.net.service;

import ru.itis.shagiakhmetova.net.dto.SignUpForm;
import ru.itis.shagiakhmetova.net.model.User;

import java.util.List;
public interface UserService {
    List<SignUpForm> findAll();
    void save(User user);
    SignUpForm findByLogin(String login);
}
