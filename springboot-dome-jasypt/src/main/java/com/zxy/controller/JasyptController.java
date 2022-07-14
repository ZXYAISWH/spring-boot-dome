package com.zxy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JasyptController {

    @Value("${info.key}")
    private String key;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/decrypt")
    public String decrypt(){
        return key;
    }

}
