package by.devincubator.service.impl;

import by.devincubator.entity.Answer;
import by.devincubator.repository.AnswerRepository;
import by.devincubator.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    AnswerRepository answerRepository;


    @Override
    public Answer getByAnswerId(int answerId) {
        return answerRepository.findByAnswerId(answerId);
    }

}
