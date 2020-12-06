package by.devincubator.repository;

import by.devincubator.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserStatisticRepository extends JpaRepository<Test, Integer> {

    @Query(value = "call get_tests_which_user_passed(:userId);", nativeQuery = true)
    List<Test> getTestWhichUserPassed(@Param("userId") Integer userId);

    @Query(value = "call how_many_times_user_passed_test(:userId, :testId);", nativeQuery = true)
    Double getHowManyTimesUserPassedTest(@Param("userId") Integer userId, @Param("testId") Integer testId);

    @Query(value = "call percentage_of_user_correct_answers_to_test(:userId, :testId);", nativeQuery = true)
    Double getPercentageOfUserCorrectAnswersToTest(@Param("userId") Integer userId, @Param("testId") Integer testId);
}
