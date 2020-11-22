package by.devincubator.controller.user;

import by.devincubator.entity.Test;
import by.devincubator.entity.Topic;
import by.devincubator.service.TopicService;
import by.devincubator.service.impl.TopicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/user")
public class ChoiceController {

    @Autowired
    TopicServiceImpl topicService;

    @GetMapping(value = "/choice")
    public String userChoicePage(Model model){
        model.addAttribute("topicNames", topicService.getAll());
        return "user/choice";
    }



    @PostMapping(value = "/choice")
    @ResponseBody
    public List<Test> userChoicePageTest(@RequestBody Topic topic){
        return new ArrayList(topicService.getTestByTopicId(topic.getTopicId()).getTestSet());
    }


}
