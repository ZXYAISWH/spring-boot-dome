package com.zxy.controller;

import com.zxy.domain.Emp;
import com.zxy.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<Emp> selectAll(){
        System.out.println(empService.selectAll().size());
        return empService.selectAll();
    }
}
