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


import javax.servlet.http.HttpSession;
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

    //private static List<Question> questionList;




    @GetMapping(value = "/startTest")
    public String startTest(@RequestParam int testId,  Model model, HttpSession session){


        List<Question> questionList = new ArrayList<>(testService.findByTestId(testId).getQuestionSet());

        session.setAttribute("questionList", questionList);
        session.setAttribute("counter", 1);
        session.setAttribute("max", questionList.size());
        model.addAttribute("question", questionList.get(0));

        return "user/question";
    }

    @GetMapping(value = "/nextQuestion")
    public String nextQuestion(@RequestParam(required = false) int[] answersId, Model model, HttpSession session){

        if(session.getAttribute("firstAnswer") == null){
            session.setAttribute("firstAnswer", new Date());
        }

        int counter = (int) session.getAttribute("counter");
        int max = (int) session.getAttribute("max");
        List<Question> questionList = (List<Question>) session.getAttribute("questionList");
        statisticService.addStat(userService.getByLogin(LoginController.getPrincipal()), questionList.get(counter-1), answersId);

        if (counter < max){
            model.addAttribute("question", questionList.get(counter));
            session.setAttribute("counter",counter + 1);
            return "user/question";
        } else {
            session.removeAttribute("questionList");
            session.removeAttribute("counter");
            session.removeAttribute("max");
            return resultController.resultPage(model, session) ;
        }


    }




}
