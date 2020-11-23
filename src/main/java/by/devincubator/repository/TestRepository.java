package by.devincubator.repository;

import by.devincubator.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Integer> {

    Test findByTestId(int testId);

}
