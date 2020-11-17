package by.devincubator.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ResultController {

    @GetMapping(value = "/result")
    public String resultPage(Model model){
        return "user/result";
    }

}
