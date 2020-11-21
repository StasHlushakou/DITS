package by.devincubator.controller.user;

import by.devincubator.service.TopicService;
import by.devincubator.service.impl.TopicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class ChoiceController {

    @Autowired
    TopicServiceImpl topicService;


    @GetMapping(value = "/choice")
    public List<String> userChoicePage(@RequestParam(value = "topic", required = false)String topic){
        return topicService;
    }

}
