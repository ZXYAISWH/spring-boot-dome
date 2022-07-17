package com.zxy.springbootdomeslf4j.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Slf4jController {

    @RequestMapping("/hello")
    public String hello(String name){
        log.info("响应的名字是:" + name);
        return "这是slf4j日志信息";
    }
}
