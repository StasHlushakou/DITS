package by.devincubator.repository;

import by.devincubator.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TestRepository extends JpaRepository<Test, Integer> {

    @Query(value = "call percentage_of_correct_answers_to_test(:id);", nativeQuery = true)
    Double getPercentageOfCorrectAnswersToTest(@Param("id") Integer id);

    @Query(value = "call how_many_times_test_passed(:id);", nativeQuery = true)
    Integer getHowManyTimesTestWasPassed(@Param("id") Integer id);
}
