package by.devincubator.entity;

import java.util.List;

public class PersonalStatisticModel {

    String userName;
    String testName;
    String questionDescription;
    int numberOfAnswer;
    double percentOfRightAnswer;


    public PersonalStatisticModel(String userName, String testName, String questionDescription, int numberOfAnswer, double percentOfRightAnswer) {
        this.userName = userName;
        this.testName = testName;
        this.questionDescription = questionDescription;
        this.numberOfAnswer = numberOfAnswer;
        this.percentOfRightAnswer = percentOfRightAnswer;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public int getNumberOfAnswer() {
        return numberOfAnswer;
    }

    public void setNumberOfAnswer(int numberOfAnswer) {
        this.numberOfAnswer = numberOfAnswer;
    }

    public double getPercentOfRightAnswer() {
        return percentOfRightAnswer;
    }

    public void setPercentOfRightAnswer(double percentOfRightAnswer) {
        this.percentOfRightAnswer = percentOfRightAnswer;
    }
}
