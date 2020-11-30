package by.devincubator.repository;

import by.devincubator.entity.Statistic;
import by.devincubator.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticRepository extends JpaRepository<Statistic, Integer> {

    Statistic save(Statistic statistic);

    Statistic findByStatisticId(int statisticId);

}
