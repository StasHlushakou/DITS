package by.devincubator.controller.mentor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MentorController {

    @GetMapping(value = "/mentor")
    public String adminPage(Model model){
        return "mentor/mentor";
    }

}
