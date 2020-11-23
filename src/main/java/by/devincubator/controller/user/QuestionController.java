package by.devincubator.controller.user;

import by.devincubator.entity.Question;
import by.devincubator.service.impl.TestServiceImpl;
import by.devincubator.service.impl.TopicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class QuestionController {

    @Autowired
    TestServiceImpl testService;


    private static List<Question> questionList;
    private static int counter;


    @GetMapping(value = "/question")
    public String firstQuestion(@RequestParam(value="topic", required=true) int topicId,
                                 @RequestParam(value="test", required=true) int testId,  Model model){

        questionList =  new ArrayList<Question>(testService.getQuestionSetByTestId(testId).getQuestionSet());
        counter = 0;

        model.addAttribute("question", questionList.get(counter));
        counter++;


        return "user/question";
    }

    @GetMapping(value = "/nextQuestion")
    public String nextQuestion(Model model){


        model.addAttribute("question", questionList.get(counter));
        counter++;


        return "user/question";
    }




}
