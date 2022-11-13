package com.practice.awscicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("testApi")
    public String testEndPoint(){
        return "App is up and running!!";
    }
}
