package by.devincubator.service;

import by.devincubator.entity.Question;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionService {

    Question getByQuestionId(int questionId);
    List<Question> getUserQuestionList(int userId);

}
