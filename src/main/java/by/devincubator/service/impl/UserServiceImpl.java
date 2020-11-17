package by.devincubator.service.impl;

import by.devincubator.entity.User;
import by.devincubator.repository.TopicRepository;
import by.devincubator.repository.UserRepository;
import by.devincubator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

}
