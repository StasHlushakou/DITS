package by.devincubator.controller.user;

import by.devincubator.controller.LoginController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class MainController {

    @GetMapping(value = "/main")
    public String userMainPage(Model model){
        return "user/main";
    }

    @GetMapping()
    public String user(Model model){
        return "user/main";
    }


}
