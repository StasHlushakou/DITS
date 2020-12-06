package by.devincubator.converter;

import by.devincubator.entity.Role;
import by.devincubator.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RoleToUserRoleSet implements Converter<Object, Role> {
    @Autowired
    public RoleService roleService;

    @Override
    public Role convert(Object o) {
        Integer id = Integer.parseInt((String) o);
        Role role = roleService.getById(id).get();
        return role;
    }
}
