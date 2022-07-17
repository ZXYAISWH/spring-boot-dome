package com.zxy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestWebServerController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
