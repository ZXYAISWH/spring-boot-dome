package com.zxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","zxy");
        return "index";
    }

}
