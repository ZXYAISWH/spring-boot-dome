package com.zxy.controller;

import com.zxy.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRedisController {

    @Autowired
    private RedisUtils redisUtils;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        System.out.println(name);
        redisUtils.set("aaa",name);
        return "success";
    }
}
