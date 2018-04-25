package com.meetcity.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    String index(){
        return "Hello Spring Boot!";
    }
}
