package kns.demo.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/","/home"})
    public String homePage(){
        return "home";
    }

    @GetMapping("/schedule")
    public String schedulePage(){
        return "schedule";
    }
}
