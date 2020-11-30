package by.devincubator.service.impl;

import by.devincubator.entity.Answer;
import by.devincubator.entity.Question;
import by.devincubator.entity.Statistic;
import by.devincubator.entity.User;
import by.devincubator.repository.StatisticRepository;
import by.devincubator.service.AnswerService;
import by.devincubator.service.QuestionService;
import by.devincubator.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    StatisticRepository statisticRepository;

    @Autowired
    AnswerService answerService;


    @Override
    public void addStatistic(Statistic statistic) {
        statisticRepository.save(statistic);
    }


    @Override
    public void addStat(User user, Question question, int[] answersId) {
        Statistic statistic = new Statistic();
        statistic.setDate(new Date());
        statistic.setQuestion(question);
        statistic.setUser(user);

        if(answersId == null){
            statistic.setCorrect(0);
            statisticRepository.save(statistic);
            return;
        }



        List<Answer> answerList = new ArrayList<>(question.getCorrectAnswers());

        for (int i : answersId){
            Answer answer = answerService.getByAnswerId(i);

            if (answer.getCorrect() == 0){
                statistic.setCorrect(0);
                statisticRepository.save(statistic);
                return;
            } else {
                answerList.remove(answer);
            }
        }

        if(answerList.isEmpty()){
            statistic.setCorrect(1);
        } else {
            statistic.setCorrect(0);
        }

        statisticRepository.save(statistic);


    }


}
