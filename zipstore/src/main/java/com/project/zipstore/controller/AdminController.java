package com.project.zipstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @GetMapping("/admin-greet")
    public String greet(){
        return "Hello Everyone!, I'm Admin of this website!";
    }
}
