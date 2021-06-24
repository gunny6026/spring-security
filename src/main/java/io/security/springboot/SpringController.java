package io.security.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @GetMapping("/")
    public String index(){
        return "home";
    }
    @GetMapping("loginPage")
    public String loginPage(){
        return "loginPage";
    }
}
