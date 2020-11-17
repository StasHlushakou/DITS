package by.devincubator.controller.user;

import by.devincubator.controller.LoginController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping(value = "/user")
    public String adminPage(Model model){
        model.addAttribute("user", LoginController.getPrincipal());
        return "user/user";
    }

}
