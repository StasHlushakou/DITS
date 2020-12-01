package by.devincubator.service;

import by.devincubator.entity.Question;
import by.devincubator.entity.Statistic;
import by.devincubator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public interface StatisticService {

    void addStatistic(Statistic statistic);

    void addStat(User user, Question question, int[] answersId);

    List<Statistic> getUserResultStatistic(int userId, Date firstQuestionTime, Date lastQuestionTime);

}
