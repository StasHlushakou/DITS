package by.devincubator.service;


import by.devincubator.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User getByLogin(String login);

    List<User> getAll();

    void save(User user);

    Optional<User> getById(Integer id);

    boolean checkUserExistence(User user);

}
