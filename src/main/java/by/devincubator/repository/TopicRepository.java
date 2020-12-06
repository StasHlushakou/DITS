package by.devincubator.repository;

import by.devincubator.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TopicRepository extends JpaRepository<Topic, Integer> {

    @Query("select t from Topic t where t.name = :name")
    Topic findByName(@Param("name") String name);
}
