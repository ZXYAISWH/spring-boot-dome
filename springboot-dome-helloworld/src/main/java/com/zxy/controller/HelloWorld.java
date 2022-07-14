package com.zxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(String name){
        return "helloWorld";
    }
}
