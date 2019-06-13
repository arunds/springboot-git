package com.techinstance.git;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Greetings from Jetty! Spring Boot!";
    }
    
    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome from Git Repo! Spring Boot!";
    }

}