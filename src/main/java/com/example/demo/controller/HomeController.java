package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/hi"})
    public void Home(){
        System.out.println("jsdkklasd");
//        return "template/home";
    }
}