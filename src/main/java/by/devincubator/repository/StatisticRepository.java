package by.devincubator.repository;

import by.devincubator.entity.Statistic;
import by.devincubator.entity.Test;
import by.devincubator.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface StatisticRepository extends JpaRepository<Statistic, Integer> {

    Statistic save(Statistic statistic);

    Statistic findByStatisticId(int statisticId);

    @Query(value = "call getUserResultStatistic(:userId, :firstQuestionTime, :lastQuestionTime);", nativeQuery = true)
    List<Statistic> getUserResultStatistic(@Param("userId") int userId,
                                           @Param("firstQuestionTime") Date firstQuestionTime,
                                           @Param("lastQuestionTime") Date lastQuestionTime);


    @Query(value = "call PercentOfRightAnswerUserToQuestion(:userId, :questionId);", nativeQuery = true)
    double getPercentOfRightAnswerUserToQuestion(@Param("userId") int userId,
                                                 @Param("questionId") int questionId);

    @Query(value = "call NumberOfAnswerUserToQuestion(:userId, :questionId);", nativeQuery = true)
    int getNumberOfAnswerUserToQuestion(@Param("userId") int userId,
                                        @Param("questionId") int questionId);

    @Query(value = "call PercentOfRightAnswerUserInTest(:userId, :firstQuestionTime, :lastQuestionTime);", nativeQuery = true)
    int getPercentOfRightAnswerUserInTest(@Param("userId") int userId,
                                          @Param("firstQuestionTime") Date firstQuestionTime,
                                          @Param("lastQuestionTime") Date lastQuestionTime);








}
