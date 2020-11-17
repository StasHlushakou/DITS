package by.devincubator.service.impl;


import by.devincubator.entity.Role;
import by.devincubator.entity.User;
import by.devincubator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        // с помощью нашего сервиса UserService получаем User
        User user = userService.getByLogin(login);
        // указываем роли для этого пользователя
        Set<GrantedAuthority> roles = new HashSet();
        for (Role role : user.getRoleSet()){
            roles.add(new SimpleGrantedAuthority(role.getRole()));
        }

        // на основании полученных данных формируем объект UserDetails
        // который позволит проверить введенный пользователем логин и пароль
        // и уже потом аутентифицировать пользователя
        UserDetails userDetails =
                new org.springframework.security.core.userdetails.User(user.getLogin(),
                        passwordEncoder.encode(user.getPassword()),
                        roles);

        System.out.println(passwordEncoder.encode(user.getPassword()));

        return userDetails;
    }

}