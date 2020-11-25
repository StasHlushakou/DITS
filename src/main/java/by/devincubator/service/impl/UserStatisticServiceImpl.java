package by.devincubator.service.impl;

import by.devincubator.entity.Test;
import by.devincubator.entity.User;
import by.devincubator.entity.view.UserStatistic;
import by.devincubator.repository.UserRepository;
import by.devincubator.repository.UserStatisticRepository;
import by.devincubator.service.UserStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserStatisticServiceImpl implements UserStatisticService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserStatisticRepository userStatisticRepository;

    @Override
    public List<Test> getTestIdWhichUserPassed(Integer userId) {
        return userStatisticRepository.getTestWhichUserPassed(userId);
    }

    @Override
    public Double getHowManyTimesUserPassedTest(Integer userId, Integer testId) {
        return userStatisticRepository.getHowManyTimesUserPassedTest(userId, testId);
    }

    @Override
    public Double getPercentageOfUserCorrectAnswersToTest(Integer userId, Integer testId) {
        return userStatisticRepository.getPercentageOfUserCorrectAnswersToTest(userId, testId);
    }

    @Override
    public List<UserStatistic> getAllUserStatistic() {
        List<UserStatistic> userStatisticList = new ArrayList<>();
        List<User> userList = userRepository.findAll();

        for (User user : userList) {
            Integer userId = user.getUserId();

            List<Test> testList = userStatisticRepository.getTestWhichUserPassed(userId);

            if (!testList.isEmpty()) {
                testList.forEach(t -> userStatisticList.add(new UserStatistic(
                        t.getTestId(),
                        user.getLastName() + " " + user.getFirstName(),
                        t.getName(),
                        getHowManyTimesUserPassedTest(userId, t.getTestId()),
                        getPercentageOfUserCorrectAnswersToTest(userId, t.getTestId()))));
            }
        }
        return userStatisticList;
    }
}
