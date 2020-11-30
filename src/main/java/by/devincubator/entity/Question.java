package by.devincubator.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer questionId;
    private String description;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Statistic> statisticSet;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Answer> answerSet;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Literature> literatureSet;

    @ManyToOne
    @JoinColumn(name = "testId", insertable = false, updatable = false)
    private Test test;

    public Set<Statistic> getStatisticSet() {
        return statisticSet;
    }

    public void setStatisticSet(Set<Statistic> statisticSet) {
        this.statisticSet = statisticSet;
    }

    public Set<Answer> getAnswerSet() {
        return answerSet;
    }

    public void setAnswerSet(Set<Answer> answerSet) {
        this.answerSet = answerSet;
    }

    public Set<Literature> getLiteratureSet() {
        return literatureSet;
    }

    public void setLiteratureSet(Set<Literature> literatureSet) {
        this.literatureSet = literatureSet;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return questionId.equals(question.questionId) &&
                description.equals(question.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionId, description);
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", description='" + description +
                '}';
    }



    public List<Answer> getCorrectAnswers(){
        return answerSet.stream().filter((a) -> a.getCorrect() == 1).collect(Collectors.toList());
    }


}
