package by.devincubator.repository;

import by.devincubator.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TestRepository extends JpaRepository<Test, Integer> {

    Test findByTestId(int testId);

    @Query(value = "call percentage_of_correct_answers_to_test(:id);", nativeQuery = true)
    Double getPercentageOfCorrectAnswersToTest(@Param("id") Integer id);

    @Query(value = "call how_many_times_test_passed(:id);", nativeQuery = true)
    Integer getHowManyTimesTestWasPassed(@Param("id") Integer id);

    @Query("select t from Test t where t.testId = :testId")
    Optional<Test> findById(@Param("testId") Integer testId);

    @Query("select t from Test t where t.name = :name")
    Test findByName(@Param("name") String name);
}
