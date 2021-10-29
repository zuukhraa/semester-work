package ru.itis.shagiakhmetova.net.service;

import ru.itis.shagiakhmetova.net.dto.UserDto;
import ru.itis.shagiakhmetova.net.model.User;
import java.util.List;

public interface UserServ {
    void save(User user);
    public UserDto findByLogin(String login);
    public UserDto findByLoginAndPassword(String login, String password);
    public List<UserDto> getAll();
    public UserDto get(int id);
    public void changeLogin(int id, String login);
}
