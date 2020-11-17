package by.devincubator.service.impl;

import by.devincubator.entity.Role;
import by.devincubator.repository.RoleRepository;
import by.devincubator.repository.UserRepository;
import by.devincubator.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }
}