package by.devincubator.repository;

import by.devincubator.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select u from User u where u.login = :login")
    User findByLogin(@Param("login") String name);

    @Query("select u from User u where u.userId = :userId")
    Optional<User> findById(@Param("userId") Integer userId);

}
