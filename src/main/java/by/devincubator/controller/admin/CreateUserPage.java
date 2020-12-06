package by.devincubator.controller.admin;

import by.devincubator.entity.Role;
import by.devincubator.entity.User;
import by.devincubator.service.RoleService;
import by.devincubator.service.UserService;
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
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @GetMapping(value = "/createUser")
    public ModelAndView showForm(Model model) {
        List<Role> roles = roleService.getAll();
        model.addAttribute("allRoles", roles);
        return new ModelAndView("admin/createUser", "user", new User());
    }

    @PostMapping(value = "/createUser")
    public String addUser(Model model, @ModelAttribute("user") User user) {
        if (userService.checkUserExistence(user)) {
            model.addAttribute("success", "Пользователь c логином " + user.getLogin() + " уже существует");
        } else {
            userService.save(user);
            model.addAttribute("success", "Пользователь " + user.getFirstName() + " " + user.getLastName() + " зарегестрирован");
        }
        return "admin/registrationSuccess";
    }
}
