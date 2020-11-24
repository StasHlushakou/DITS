package by.devincubator.service.impl;

import by.devincubator.entity.Topic;
import by.devincubator.repository.TopicRepository;
import by.devincubator.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Override
    public List<Topic> getAll() {
        return topicRepository.findAll();
    }

    @Override
    public List<String> getAllNames() {
        List<Topic> topics = topicRepository.findAll();
        List<String> names = new ArrayList<>();
        topics.forEach(t -> names.add(t.getName()));
        return names;
    }
}
