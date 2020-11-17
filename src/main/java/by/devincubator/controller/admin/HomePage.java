package by.devincubator.controller.admin;

import by.devincubator.controller.LoginController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class HomePage {

    @GetMapping
    public String homePage(Model model){
        model.addAttribute("user", LoginController.getPrincipal());
        return "admin/homePage";
    }

    @GetMapping(value = "/createTest")
    public String createTest(){
        return "admin/createTest";
    }

    /*@GetMapping(value = "/createUser")
    public String createUser(){
        return "admin/createUser";
    }*/

    @GetMapping(value = "/showStatistic")
    public String showStatistic(){
        return "admin/showStatistic";
    }
}
