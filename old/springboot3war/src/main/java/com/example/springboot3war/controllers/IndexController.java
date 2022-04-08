package com.example.springboot3war.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
    @GetMapping({"/","/index","/home"})
    //@ResponseBody //add this with Jakarta, if not change @Controller to @RestController
    public String homePage(){
        return "index";
    }
}
