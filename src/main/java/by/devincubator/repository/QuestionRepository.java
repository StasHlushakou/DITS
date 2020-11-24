package by.devincubator.repository;

import by.devincubator.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

    @Query(value = "call percentage_of_correct_answers_to_question(:id);", nativeQuery = true)
    Double getPercentageOfCorrectAnswersToQuestion(@Param("id") Integer id);

    @Query(value = "call how_many_times_question_was_answered(:id);", nativeQuery = true)
    Integer getHowManyTimesQuestionWasAnswered(@Param("id") Integer id);
}
