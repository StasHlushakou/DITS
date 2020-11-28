package by.devincubator.controller.user;

import by.devincubator.entity.Question;
import by.devincubator.service.StatisticService;
import by.devincubator.service.TestService;
import by.devincubator.service.impl.StatisticServiceImpl;
import by.devincubator.service.impl.TestServiceImpl;
import by.devincubator.service.impl.TopicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class QuestionController {

    @Autowired
    TestService testService;

    @Autowired
    StatisticServiceImpl statisticService;



    private static List<Question> questionList;
    private static int max;
    private static int counter;
    private static Map<Question, List<Integer> > statList;


    @GetMapping(value = "/startTest")
    public String startTest(@RequestParam int testId,  Model model){

        statList = new LinkedHashMap<>();
        questionList = testService.getQuestionsByTestId(testId);
        max = questionList.size();
        counter = 0;

        model.addAttribute("question", questionList.get(counter));

        counter++;
        return "user/question";
    }

    @GetMapping(value = "/nextQuestion")
    public String nextQuestion(@RequestParam(required = false) List<Integer> answersId, Model model){

        statList.put(questionList.get(counter-1), answersId);

        if (counter < max){
            model.addAttribute("question", questionList.get(counter));
            counter++;
            return "user/question";
        } else {
            return new ResultController().resultPage(statList, model);
        }


    }




}
