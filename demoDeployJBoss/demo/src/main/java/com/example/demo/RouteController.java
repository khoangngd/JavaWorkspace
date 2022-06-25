package com.example.demo;

import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j
@RestController
public class RouteController {

    @GetMapping({"/","/index"})
    public String indexPage(){

        System.out.println("System.out.println");

        log.info("info..........................");
        log.debug("debug..........................");
        log.error("error..........................");


        return "Hello world!";
    }
}
