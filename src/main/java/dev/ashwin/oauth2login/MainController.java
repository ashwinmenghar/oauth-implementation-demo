package dev.ashwin.oauth2login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {
    @GetMapping
    public String welcome() {
        return "Welcome to Login !!";
    }

    @GetMapping("/user")
    public Principal user(Principal principal) {
        System.out.println("user: " + principal.getName());
        return principal;
    }
}
