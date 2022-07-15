package com.zxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tests")
public class IndexController {

//    @RequestMapping("/hello")
//    public String index(){
//        return "index.html";
//    }
//
//    @PutMapping("/login/{account}")
//    @ResponseBody
//    public String login(@PathVariable("account") String account){
//        System.out.println(account);
//        return "welcome";
//    }

    @PostMapping("/post")
    @ResponseBody
    public String post(String name){
        System.out.println(name);
        return "post测试";
    }

    @GetMapping("/get/{name}")
    @ResponseBody
    public String get(@PathVariable("name") String name){
        System.out.println(name);
        return "get测试";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put( String name){
        System.out.println(name);
        return "put测试";
    }

    @DeleteMapping("/delete/{name}&{sss}")
    @ResponseBody
    public String delete( @PathVariable("name") String name,@PathVariable("sss") String sss){
        System.out.println(name);
        System.out.println(sss);
        return "delete测试";
    }
}
