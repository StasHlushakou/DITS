package by.devincubator.controller.user;

import by.devincubator.controller.LoginController;
import by.devincubator.entity.PersonalStatisticModel;
import by.devincubator.entity.Question;
import by.devincubator.entity.Statistic;
import by.devincubator.entity.User;
import by.devincubator.service.QuestionService;
import by.devincubator.service.StatisticService;
import by.devincubator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/user")
public class PersonalStatisticController {


    @Autowired
    StatisticService statisticService;

    @Autowired
    UserService userService;

    @Autowired
    QuestionService questionService;

    @GetMapping(value = "/personalStatistic")
    public String personalStatisticPage(Model model){

        User user = userService.getByLogin(LoginController.getPrincipal());
        String userName = user.getFirstName() + " " + user.getLastName();

        List<Question> userQuestionList = questionService.getUserQuestionList(user.getUserId());

        List<PersonalStatisticModel> userStatList = new ArrayList<>();



        for (Question question : userQuestionList){

            userStatList.add(new PersonalStatisticModel(
                    userName,
                    question.getTest().getName(),
                    question.getDescription(),
                    statisticService.getNumberOfAnswerUserToQuestion(user.getUserId(), question.getQuestionId()),
                    statisticService.getPercentOfRightAnswerUserToQuestion(user.getUserId(), question.getQuestionId())));
        }

        model.addAttribute("userStatList", userStatList);

        return "user/personalStatistic";
    }

}
