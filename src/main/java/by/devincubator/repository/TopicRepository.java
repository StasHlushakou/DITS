package by.devincubator.repository;

import by.devincubator.entity.Topic;
import by.devincubator.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TopicRepository extends JpaRepository<Topic, Integer> {

    Topic findByTopicId(int topicId);

}
