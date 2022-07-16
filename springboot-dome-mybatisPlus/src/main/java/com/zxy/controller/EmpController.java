package com.zxy.controller;

import com.zxy.domain.Emp;
import com.zxy.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;


    @RequestMapping("/emp")
    public List<Emp> selectAll(){
        return empService.selectAll();
    }

    @GetMapping("/selectOne/{empno}")
    public Emp selectOne(@PathVariable("empno") Integer empno){
        return empService.selectOne(empno);
    }
}
