package by.devincubator.service;

import by.devincubator.entity.Question;
import by.devincubator.entity.Test;

import java.util.List;
import java.util.Set;

public interface TestService {

    List<Question> getQuestionsByTestId(int testId);

}
