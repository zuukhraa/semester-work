package ru.itis.shagiakhmetova.net.service;


import ru.itis.shagiakhmetova.net.dao.DaoImpl;
import ru.itis.shagiakhmetova.net.dto.SignUpForm;
import ru.itis.shagiakhmetova.net.helper.PasswordHelper;
import ru.itis.shagiakhmetova.net.model.User;
import java.util.List;
import java.util.stream.Collectors;


public class UserServiceImpl implements UserService {

    DaoImpl dao = new DaoImpl();
    @Override
    public List<SignUpForm> findAll() {
        List<User> users = dao.getAll();

        return users.stream()
                .map(user -> new SignUpForm(user.getLastName(), user.getFirstName(), user.getPhone(),
                        user.getFaculty_name(), user.getLogin(), user.getPassword()))
                .collect(Collectors.toList());
    }

    @Override
    public void save(User user) {
        dao.save(new User(user.getLastName(), user.getFirstName(), user.getPhone(),
                user.getFaculty_name(), user.getLogin(), PasswordHelper.encrypt(user.getPassword())));
    }

    @Override
    public SignUpForm findByLogin(String login) {
        User user = dao.findByLogin(login);
        return new SignUpForm( user.getFirstName(),user.getLastName(), user.getPhone(),
                user.getFaculty_name(), user.getLogin(), user.getPassword());
    }

}
