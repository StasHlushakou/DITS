package by.devincubator.service.impl;

import by.devincubator.entity.Question;
import by.devincubator.repository.QuestionRepository;
import by.devincubator.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Question getByQuestionId(int questionId) {
        return questionRepository.findByQuestionId(questionId);
    }
}
