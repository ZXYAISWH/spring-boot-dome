package com.zxy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerController {

    @RequestMapping("/freemarker")
    public String index(Model model){
        System.out.println("111");
        model.addAttribute("name","zhangsan");
        return "index";
    }
}
