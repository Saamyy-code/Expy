package com.sameer.expensetracker.controller;//Tells Java this class belongs to the controller package

import com.sameer.expensetracker.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;// Imports SpringBoot Classes
import org.springframework.web.bind.annotation.RestController;// Imports SpringBoot Classes

@RestController
public class HelloController {
    private GreetingService greetingService;

    public HelloController(GreetingService greetingService){
            this.greetingService = greetingService;
    }
    @GetMapping("/hello")
    public String sayHello(){
        return greetingService.getGreeting();
    }
}