package by.devincubator.repository;

import by.devincubator.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    @Query("select r from Role r where r.roleId = :roleId")
    Optional<Role> findById(@Param("roleId") Integer roleId);
}
