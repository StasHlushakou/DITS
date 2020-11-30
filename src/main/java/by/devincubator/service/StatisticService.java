package by.devincubator.service;

import by.devincubator.entity.Question;
import by.devincubator.entity.Statistic;
import by.devincubator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public interface StatisticService {

    void addStatistic(Statistic statistic);

    void addStat(User user, Question question, int[] answersId);


}
