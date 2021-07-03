package io.security.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() throws Exception{
        return "home";
    }

    @GetMapping("/login")
    public String login() throws Exception{
        return "login";
    }
}
