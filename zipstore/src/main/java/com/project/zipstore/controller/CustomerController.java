package com.project.zipstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @GetMapping("/customer-greet")
    public String greet(){
        return "Hello Everyone!, I'm Customer of this website!";
    }
}
