package by.devincubator.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer topicId;
    private String description;
    private String name;

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Test> getTestSet() {
        return testSet;
    }

    @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Test> testSet;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return topicId.equals(topic.topicId) &&
                description.equals(topic.description) &&
                name.equals(topic.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicId, description, name);
    }

    @Override
    public String toString() {
        return "Topic{" +
                "topicId=" + topicId +
                ", description='" + description + '\'' +
                ", name='" + name +
                '}';
    }
}
