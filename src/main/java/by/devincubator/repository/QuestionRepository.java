package by.devincubator.repository;

import by.devincubator.entity.Question;
import by.devincubator.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

    Question findByQuestionId(int questionId);

    @Query(value = "call getUserQuestionList(:userId);", nativeQuery = true)
    List<Question> getUserQuestionList(@Param("userId") int userId);



}
