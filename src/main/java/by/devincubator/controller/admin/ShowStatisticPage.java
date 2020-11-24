package by.devincubator.controller.admin;

import by.devincubator.service.QuestionService;
import by.devincubator.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ShowStatisticPage {

    @Autowired
    QuestionService questionService;

    @Autowired
    TestService testService;

    @GetMapping(value = "statistic/showQuestionStatistic")
    public String showQuestionStatistic(Model model) {
        model.addAttribute("questionStatistic", questionService.getQuestionStatisticList());
        return "admin/statistic/showQuestionStatistic";
    }

    @GetMapping(value = "statistic/showTestStatistic")
    public String showTestStatistic(Model model) {
        model.addAttribute("testStatistic", testService.getTestStatisticList());
        return "admin/statistic/showTestStatistic";
    }

    @GetMapping(value = "goHomeAdmin")
    public String goHomeAdmin() {
        return "admin/homePage";
    }

    @GetMapping(value = "goToShowStatistic")
    public String goToShowStatistic() {
        return "admin/showStatistic";
    }
}
