package by.devincubator.repository;

import by.devincubator.entity.Answer;
import by.devincubator.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

    Answer findByAnswerId(int answerId);

}
