package by.devincubator.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowStatisticPage {

    @GetMapping(value = "goHomeAdmin")
    public String goHomeAdmin(){
        return "admin/homePage";
    }
}
