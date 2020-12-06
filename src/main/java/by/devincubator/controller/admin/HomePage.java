package by.devincubator.controller.admin;

import by.devincubator.controller.LoginController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class HomePage {

    @GetMapping
    public String homePage(Model model){
        model.addAttribute("user", LoginController.getPrincipal());
        return "admin/homePage";
    }

    @GetMapping(value = "/registrationSuccess")
    public String resultPage(@RequestParam String success,
                             Model model){
        model.addAttribute("success", success);
        return "admin/registrationSuccess";
    }
}
