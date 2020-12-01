package by.devincubator.controller.user;

import by.devincubator.controller.LoginController;
import by.devincubator.entity.Literature;
import by.devincubator.entity.Statistic;
import by.devincubator.entity.User;
import by.devincubator.entity.UserResultModel;
import by.devincubator.service.StatisticService;
import by.devincubator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/user")
public class ResultController {

    @Autowired
    StatisticService statisticService;

    @Autowired
    UserService userService;


    @GetMapping(value = "/result")
    public String resultPage(Date firstAnswer, Date lastAnswer, Model model){

        User user = userService.getByLogin(LoginController.getPrincipal());

        List<Statistic> statList = statisticService.getUserResultStatistic(user.getUserId(), firstAnswer, lastAnswer);

        List<UserResultModel> userResultModelList = new ArrayList<>();

        for (Statistic statistic : statList){

            String description = statistic.getQuestion().getDescription();
            String isCorrect;
            if(statistic.getCorrect() == 1){
                isCorrect = "correct";
            } else {
                isCorrect = "not correct";
            }
            List<String> literatureList = new ArrayList<>() ;
            List<String> linkList = new ArrayList<>() ;

            for (Literature literature : statistic.getQuestion().getLiteratureSet()){
                literatureList.add(literature.getDescription());
                linkList.add(literature.getLink().getLink());
            }


            userResultModelList.add(new UserResultModel(description, isCorrect, literatureList, linkList));
        }


        model.addAttribute("userResultModelList", userResultModelList);




        return "user/result";
    }

}
