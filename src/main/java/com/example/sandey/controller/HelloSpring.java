package com.example.sandey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloSpring {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
