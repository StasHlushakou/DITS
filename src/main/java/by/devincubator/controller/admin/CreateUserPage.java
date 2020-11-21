package by.devincubator.controller.admin;

import by.devincubator.entity.Role;
import by.devincubator.entity.User;
import by.devincubator.service.RoleService;
import by.devincubator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = "/admin")
@Transactional
public class CreateUserPage {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @GetMapping(value = "/createUser")
    public ModelAndView showForm(Model model) {
        List<Role> roles = roleService.getAll();
        model.addAttribute("allRoles", roles);
        return new ModelAndView("admin/createUser", "user", new User());
    }

    @PostMapping(value = "/createUser")
    public ModelAndView addUser(Model model, @ModelAttribute("user") User user) {
        userService.save(user);
        return new ModelAndView("admin/createUser", "user", new User());
    }
}
