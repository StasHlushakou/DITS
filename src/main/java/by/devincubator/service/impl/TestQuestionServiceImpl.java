package by.devincubator.service.impl;

import by.devincubator.entity.Question;
import by.devincubator.entity.Test;
import by.devincubator.repository.QuestionRepository;
import by.devincubator.repository.TestRepository;
import by.devincubator.service.TestQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TestQuestionServiceImpl implements TestQuestionService {

    @Autowired
    TestRepository testRepository;

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public void saveTest( String testName, String allQuestionDescriptions) {
        Test test = testRepository.findByName(testName);

        List<String> questionList = convertAllQuestionDescriptionsToQuestionArray(allQuestionDescriptions);

        for (String questionDescription : questionList) {
            Optional<Question> questionOptional = questionRepository.findByDescription(questionDescription);
            if (questionOptional.isPresent()) {
                Question question = questionOptional.get();
                if (!(question.getTest().getTestId().equals(test.getTestId()))) {
                    questionRepository.save(question);
                }
            } else {
                Question question = new Question();
                question.setDescription(questionDescription);
                question.setTest(test);

                questionRepository.save(question);
            }
        }
    }

    @Override
    public boolean isQuestionsDescriptionPresent(String allQuestionDescriptions) {
        List<String> questionList = convertAllQuestionDescriptionsToQuestionArray(allQuestionDescriptions);
        return questionList.size() != 0;
    }

    private List<String> convertAllQuestionDescriptionsToQuestionArray(String allQuestionDescriptions) {
        String[] questionArray = allQuestionDescriptions.split("[0-9]+.");
        List<String> questionList = new ArrayList<>();
        for (String s : questionArray) {
            String question = s.trim();
            if (!question.isEmpty()) {
                questionList.add(question);
            }

        }
        return questionList;
    }
}
