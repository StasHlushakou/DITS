package by.devincubator.service;


import by.devincubator.entity.Test;
import by.devincubator.entity.view.UserStatistic;

import java.util.List;

public interface UserStatisticService {

    List<Test> getTestIdWhichUserPassed(Integer userId);

    Double getHowManyTimesUserPassedTest(Integer userId, Integer testId);

    Double getPercentageOfUserCorrectAnswersToTest(Integer userId, Integer testId);

    List<UserStatistic> getAllUserStatistic();
}
