package by.devincubator.service.impl;

import by.devincubator.entity.Question;
import by.devincubator.entity.Test;
import by.devincubator.repository.QuestionRepository;
import by.devincubator.repository.TestRepository;
import by.devincubator.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestRepository testRepository;


    @Override
    public Test findByTestId(int testId) {
        return testRepository.findByTestId(testId);
    }
}
