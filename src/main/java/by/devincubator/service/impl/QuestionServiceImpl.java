package by.devincubator.service.impl;

import by.devincubator.entity.Question;
import by.devincubator.repository.QuestionRepository;
import by.devincubator.entity.view.QuestionStatistic;
import by.devincubator.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository repository;

    @Override
    public Question getByQuestionId(int questionId) {
        return repository.findByQuestionId(questionId);
    }

    @Override
    public List<Question> getUserQuestionList(int userId) {
        return repository.getUserQuestionList(userId);
    }

    @Override
    public List<String> getAllDescriptions() {
        List<Question> questions = repository.findAll();
        List<String> descriptions = new ArrayList<>();
        questions.forEach(q -> descriptions.add(q.getDescription()));
        return descriptions;
    }

    @Override
    public Double getPercentageOfCorrectAnswersToQuestion(Integer id) {
        return repository.getPercentageOfCorrectAnswersToQuestion(id);
    }

    @Override
    public Integer getHowManyTimesQuestionWasAnswered(Integer id) {
        return repository.getHowManyTimesQuestionWasAnswered(id);
    }

    @Override
    public List<QuestionStatistic> getQuestionStatisticList() {
        List<QuestionStatistic> questionStatisticList = new ArrayList<>();
        List<Question> questionList = repository.findAll();

        questionList.forEach(q -> questionStatisticList.add(new QuestionStatistic(
                q.getQuestionId(),
                q.getDescription(),
                repository.getHowManyTimesQuestionWasAnswered(q.getQuestionId()),
                repository.getPercentageOfCorrectAnswersToQuestion(q.getQuestionId()))));

        return questionStatisticList;
    }

}
