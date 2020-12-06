package by.devincubator.service;

import by.devincubator.entity.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {

    Optional<Role> getById(Integer id);
    List<Role> getAll();

}
