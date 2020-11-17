package by.devincubator.service;

import by.devincubator.entity.Topic;
import by.devincubator.entity.User;

import java.util.List;

public interface UserService {

    User getByLogin(String login);
    List<User> getAll();

}
