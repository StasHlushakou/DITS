package by.devincubator.service.impl;

import by.devincubator.entity.Topic;
import by.devincubator.repository.TopicRepository;
import by.devincubator.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TopicServiceImpl implements TopicService{

    @Autowired
    private TopicRepository topicRepository;

    @Override
    public List<Topic> getAll() {
        return topicRepository.findAll();
    }
}
