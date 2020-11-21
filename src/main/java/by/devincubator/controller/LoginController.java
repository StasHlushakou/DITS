package by.devincubator.controller;

import by.devincubator.entity.Role;
import by.devincubator.entity.User;
import by.devincubator.service.UserService;
import by.devincubator.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Controller
public class LoginController {


    @Autowired
    UserService userService;


    @GetMapping("/userTypeHandler")
    public String userTypeHandlerPage(ModelMap model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        List<String> roles = new ArrayList<>();
        for(GrantedAuthority a : authorities){
            roles.add(a.getAuthority());
        }

        if (roles.contains("USER")){
            model.addAttribute("user", true);
        }
        if (roles.contains("ADMIN")){
            model.addAttribute("admin", true);
        }
        if (roles.contains("MENTOR")){
            model.addAttribute("mentor", true);
        }

        return "userTypeHandler";
    }



    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/logout")
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication!=null){
            new SecurityContextLogoutHandler().logout(request,response,authentication);
        }
        return "redirect:/login?logout";
    }

    @GetMapping("")
    public String start(Model model){
        return "index";
    }


    static public String getPrincipal() {
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }


}
