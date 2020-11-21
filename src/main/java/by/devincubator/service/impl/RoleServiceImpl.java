package by.devincubator.service.impl;

import by.devincubator.entity.Role;
import by.devincubator.repository.RoleRepository;
import by.devincubator.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Optional<Role> getById(Integer id) {
        return roleRepository.findById(id);
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }
}
