package by.devincubator.service;

public interface TestQuestionService {

    void saveTest(String testName, String allQuestionDescriptions);
    boolean isQuestionsDescriptionPresent(String allQuestionDescriptions);

}
