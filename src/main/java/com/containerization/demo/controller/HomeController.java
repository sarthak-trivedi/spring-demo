package com.containerization.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @Value("${test.var}")
    String testVar;

    @RequestMapping("/")
    public String homePage(){
       return testVar;
    }
}