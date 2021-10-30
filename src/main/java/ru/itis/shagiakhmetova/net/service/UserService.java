package ru.itis.shagiakhmetova.net.service;

import ru.itis.shagiakhmetova.net.dao.DaoImpl;
import ru.itis.shagiakhmetova.net.dto.UserDto;
import ru.itis.shagiakhmetova.net.helper.PasswordHelper;
import ru.itis.shagiakhmetova.net.model.User;
import java.util.List;
import java.util.stream.Collectors;


public class UserService implements UserServ {

    private final DaoImpl dao = new DaoImpl();
@Override
    public void save(User user) {
        dao.save(new User(
                user.getFirstName(),
                user.getLastName(),
                user.getLogin(),
                PasswordHelper.encrypt(user.getPassword()),
                user.getPhone(), user.getFaculty_name()));
    }

    @Override
    public UserDto findByLogin(String login) {
        User user = dao.findByLogin(login);
        return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getLogin(), user.getPassword(), user.getPhone(), user.getFaculty_name());
    }

    @Override
    public UserDto findByLoginAndPassword(String login, String password) {
        User user = dao.findByLoginAndPassword(login, password);
        return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getLogin(), user.getPassword(), user.getPhone(), user.getFaculty_name());
    }

    @Override
    public UserDto get(int id) {
        User user = dao.get(id);
        return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getLogin(), user.getPassword(), user.getPhone(), user.getFaculty_name());
    }

    @Override
    public List<UserDto> getAll() {
        List<User> users = dao.getAll();
        return users.stream()
                .map(user -> new UserDto(user.getId(), user.getFirstName(), user.getLastName(),
                         user.getLogin(), user.getPassword(), user.getPhone(), user.getFaculty_name()))
                .collect(Collectors.toList());
    }

//    @Override
//    public void changeLogin(int id, String login) {
//        dao.changeLogin(id, login);
//    }
}

