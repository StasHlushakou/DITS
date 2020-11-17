package by.devincubator.controller.admin;

import by.devincubator.entity.Role;
import by.devincubator.entity.User;
import by.devincubator.service.impl.RoleServiceImpl;
import by.devincubator.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(path = "/admin")
public class CreateUserPage {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    RoleServiceImpl roleService;

    @GetMapping(value = "/createUser")
    public ModelAndView showForm(Model model) {
        List<Role> roles = roleService.getAll();
        model.addAttribute("allRoles", roles);
        return new ModelAndView("admin/createUser", "user", new User());
    }

    @PostMapping(value = "/createUser")
    public String addUser(Model model, @ModelAttribute("user") User user) {
        System.out.println();
        System.out.println(user.toString());
        System.out.println();
        return "admin/createUser";
    }
}
