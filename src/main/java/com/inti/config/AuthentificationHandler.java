package com.inti.config;

import com.inti.entities.Personne;
import com.inti.service.interfaces.IPersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collection;
@Component
public class AuthentificationHandler implements AuthenticationSuccessHandler {
    @Autowired
    IPersonneService personneService;
    @Autowired
    HttpSession session;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.setStatus(HttpServletResponse.SC_OK);
        boolean admin=false;
        String username=authentication.getName();
        Personne personne=personneService.findByUsername(username);
        session.setAttribute("User",personne);

       /* String roleUser="";
        Collection<? extends GrantedAuthority> roles =authentication.getAuthorities();
        for (GrantedAuthority role:roles){
            roleUser=role.getAuthority();
        }if(roleUser.equals("admin")){
            response.sendRedirect("afficher");
        }if(roleUser.equals("utilisateur")){
            response.sendRedirect("front");
        }*/
    }
}
