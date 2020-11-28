package by.devincubator.controller.user;

import by.devincubator.entity.Question;
import by.devincubator.service.impl.StatisticServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class ResultController {

    @Autowired
    StatisticServiceImpl statisticService;


    @GetMapping(value = "/result")
    public String resultPage(Map<Question, List<Integer>> statList, Model model){


        System.out.println(statList);


        return "user/result";
    }

}
