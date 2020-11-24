package by.devincubator.service;

import by.devincubator.entity.view.QuestionStatistic;

import java.util.List;

public interface QuestionService {
    List<String> getAllDescriptions();

    Double getPercentageOfCorrectAnswersToQuestion(Integer id);

    Integer getHowManyTimesQuestionWasAnswered(Integer id);

    List<QuestionStatistic> getQuestionStatisticList();
}
