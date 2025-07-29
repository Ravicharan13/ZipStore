package com.project.zipstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/seller")
public class SellerController {

    @GetMapping("/seller-greet")
    public String greet(){
        return "Hello Everyone!, I'm Seller of this website!";
    }
}
