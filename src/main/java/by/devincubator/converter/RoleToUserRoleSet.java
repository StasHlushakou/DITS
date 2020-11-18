package by.devincubator.converter;

import by.devincubator.repository.RoleRepository;
import by.devincubator.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RoleToUserRoleSet implements Converter<Object, Role> {
    @Autowired
    public RoleRepository repository;

    @Override
    public Role convert(Object o) {
        Integer id = Integer.parseInt((String) o);
        return repository.getOne(id);
    }
}
