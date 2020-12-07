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

    @GetMapping(value = "/resultPage")
    public String resultPage(@RequestParam String result,
                             Model model){
        model.addAttribute("result", result);
        return "admin/resultPage";
    }

    @GetMapping(value = "goHomeAdmin")
    public String goHomeAdmin() {
        return "admin/homePage";
    }
}
