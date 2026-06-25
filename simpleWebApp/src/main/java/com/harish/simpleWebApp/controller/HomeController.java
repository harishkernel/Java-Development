package com.harish.simpleWebApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return  "Welcome to home page";
    }

    @RequestMapping("/about")
    public String about() {
        return "About page";
    }
}
