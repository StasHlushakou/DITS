package by.devincubator.repository;

import by.devincubator.entity.Literature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LiteratureRepository extends JpaRepository<Literature, Integer> {
}
