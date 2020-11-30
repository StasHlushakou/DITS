package by.devincubator.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Statistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer statisticId;
    private Date date;
    private Integer correct;

    public Integer getStatisticId() {
        return statisticId;
    }

    public void setStatisticId(Integer statisticId) {
        this.statisticId = statisticId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCorrect() {
        return correct;
    }

    public void setCorrect(Integer correct) {
        this.correct = correct;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @ManyToOne
    @JoinColumn(name = "userId", insertable = true, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "questionId", insertable = true, updatable = false)
    private Question question;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statistic statistic = (Statistic) o;
        return statisticId.equals(statistic.statisticId) &&
                date.equals(statistic.date) &&
                correct.equals(statistic.correct) &&
                Objects.equals(user, statistic.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statisticId, date, correct, user);
    }

    @Override
    public String toString() {
        return "Statistic{" +
                "statisticId=" + statisticId +
                ", date=" + date +
                ", correct=" + correct +
                '}';
    }
}
