package by.devincubator.service;

import by.devincubator.entity.view.TestStatistic;

import java.util.List;

public interface TestService {
    List<String> getAllNames();

    Double getPercentageOfCorrectAnswersToTest(Integer id);

    Integer getHowManyTimesTestWasPassed(Integer id);

    List<TestStatistic> getTestStatisticList();
}
