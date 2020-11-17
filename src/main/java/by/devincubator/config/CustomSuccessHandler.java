package by.devincubator.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException{
        String targetUrl = determineTargetUrl(authentication);
        if (response.isCommitted()){
            System.out.print("Can't redirect");
            return;
        }
        redirectStrategy.sendRedirect(request,response,targetUrl);
    }

    private String determineTargetUrl(Authentication authentication){
        String url = "";
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        List<String> roles = new ArrayList<>();
        for(GrantedAuthority a : authorities){
            roles.add(a.getAuthority());
        }
        if (isMentor(roles) & isAdmin(roles) || isMentor(roles) & isUser(roles) || isAdmin(roles) & isUser(roles)){
            url = "/userTypeHandler";
        } else if(isMentor(roles)){
            url = "/mentor";
        } else if(isAdmin(roles)){
            url = "/admin";
        } else if(isUser(roles)) {
            url = "/user";
        }
        return url;

    }


    private boolean isUser(List<String>roles){
        if (roles.contains("USER")){
            return true;
        }
        return false;
    }

    private boolean isMentor(List<String>roles){
        if (roles.contains("MENTOR")){
            return true;
        }
        return false;
    }

    private boolean isAdmin(List<String>roles){
        if (roles.contains("ADMIN")){
            return true;
        }
        return false;
    }

    protected RedirectStrategy getRedirectStrategy(){
        return redirectStrategy;
    }



}
