package com.devopsbuddy.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String home(){
        return "<h1>Hello World this is uttam</h1>";
    }
}
