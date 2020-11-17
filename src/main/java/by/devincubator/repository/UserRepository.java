package by.devincubator.repository;

import by.devincubator.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select u from User u where u.login = :login")
    User findByLogin(@Param("login") String name);

}
