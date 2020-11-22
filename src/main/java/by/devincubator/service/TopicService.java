package by.devincubator.service;

import by.devincubator.entity.Topic;

import java.util.List;

public interface TopicService {

    List<Topic> getAll();
    Topic getTestByTopicId(int id);


}
