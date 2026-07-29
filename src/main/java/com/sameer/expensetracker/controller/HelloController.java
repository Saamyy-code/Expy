package com.sameer.expensetracker.controller;//Tells Java this class belongs to the controller package

import org.springframework.web.bind.annotation.GetMapping;// Imports SpringBoot Classes
import org.springframework.web.bind.annotation.RestController;// Imports SpringBoot Classes

@RestController //This class contains REST API endpoints
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Welcome to Smart Expense Tracker!";
    }
}
