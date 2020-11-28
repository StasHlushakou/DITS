package by.devincubator.service.impl;

import by.devincubator.entity.Statistic;
import by.devincubator.repository.StatisticRepository;
import by.devincubator.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    StatisticRepository statisticRepository;

    @Override
    public void addStatistic(Statistic statistic) {
        statisticRepository.save(statistic);
    }
}
