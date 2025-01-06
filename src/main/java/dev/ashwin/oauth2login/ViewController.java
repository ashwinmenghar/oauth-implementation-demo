package dev.ashwin.oauth2login;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class ViewController {
    @GetMapping("/profile")
    public String profile(OAuth2AuthenticationToken token, Model model) {
        System.out.println(token.getPrincipal());
        model.addAttribute("name", token.getPrincipal().getAttribute("name"));
        model.addAttribute("email", token.getPrincipal().getAttribute("email"));
        model.addAttribute("picture", token.getPrincipal().getAttribute("picture"));
        return "user-profile";
    }

    @GetMapping("/login")
    public String login() {
        return "custom_login";
    }

}
