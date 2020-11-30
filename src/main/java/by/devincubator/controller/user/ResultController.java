package by.devincubator.controller.user;

import by.devincubator.entity.Question;
import by.devincubator.repository.StatisticRepository;
import by.devincubator.service.impl.StatisticServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class ResultController {

    @Autowired
    StatisticServiceImpl statisticService;


    @Autowired
    StatisticRepository statisticRepository;


    @GetMapping(value = "/result")
    public String resultPage(Date firstAnswer, Date lastAnswer, Model model){


        System.out.println(firstAnswer);
        System.out.println(lastAnswer);


        return "user/result";
    }

}
