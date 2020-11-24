package by.devincubator.controller.admin;

import by.devincubator.service.QuestionService;
import by.devincubator.service.TestService;
import by.devincubator.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/admin")
public class createTestPage {

    @Autowired
    private TopicService topicService;

    @Autowired
    private TestService testService;

    @Autowired
    private QuestionService questionService;

    @GetMapping(value = "/createTest")
    public String createTest(Model model) {
        model.addAttribute("topics", topicService.getAllNames());
        model.addAttribute("tests", testService.getAllNames());
        model.addAttribute("questions", questionService.getAllDescriptions());
        return "admin/createTest";
    }
}
