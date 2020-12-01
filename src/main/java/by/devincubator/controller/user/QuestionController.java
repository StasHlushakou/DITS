package by.devincubator.controller.user;

import by.devincubator.controller.LoginController;
import by.devincubator.entity.Question;
import by.devincubator.service.StatisticService;
import by.devincubator.service.TestService;
import by.devincubator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.*;


@Controller
@RequestMapping("/user")
public class QuestionController {

    @Autowired
    TestService testService;

    @Autowired
    StatisticService statisticService;

    @Autowired
    UserService userService;

    @Autowired
    ResultController resultController;

    private static List<Question> questionList;
    private static int max;
    private static int counter;
    private static Date firstAnswer;


    @GetMapping(value = "/startTest")
    public String startTest(@RequestParam int testId,  Model model){

        questionList = new ArrayList<>(testService.findByTestId(testId).getQuestionSet());
        max = questionList.size();
        counter = 0;

        model.addAttribute("question", questionList.get(counter));

        counter++;
        return "user/question";
    }

    @GetMapping(value = "/nextQuestion")
    public String nextQuestion(@RequestParam(required = false) int[] answersId, Model model){

        if(firstAnswer == null){
            firstAnswer = new Date();
        }


        statisticService.addStat(userService.getByLogin(LoginController.getPrincipal()), questionList.get(counter-1), answersId);

        if (counter < max){
            model.addAttribute("question", questionList.get(counter));
            counter++;
            return "user/question";
        } else {
            return resultController.resultPage(firstAnswer, new Date(), model) ;
        }


    }




}
