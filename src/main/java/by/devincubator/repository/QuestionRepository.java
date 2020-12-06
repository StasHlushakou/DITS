package by.devincubator.repository;

import by.devincubator.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

    @Query(value = "call percentage_of_correct_answers_to_question(:id);", nativeQuery = true)
    Double getPercentageOfCorrectAnswersToQuestion(@Param("id") Integer id);

    @Query(value = "call how_many_times_question_was_answered(:id);", nativeQuery = true)
    Integer getHowManyTimesQuestionWasAnswered(@Param("id") Integer id);

    @Query("select q from Question q where q.description = :description")
    Optional<Question> findByDescription(@Param("description") String description);

    Question findByQuestionId(int questionId);

    @Query(value = "call getUserQuestionList(:userId);", nativeQuery = true)
    List<Question> getUserQuestionList(@Param("userId") int userId);



}
