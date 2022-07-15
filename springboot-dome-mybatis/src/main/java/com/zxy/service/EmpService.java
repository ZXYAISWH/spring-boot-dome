package com.zxy.service;

import com.zxy.dao.EmpDao;
import com.zxy.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpDao empDao;

    public List<Emp> selectAll(){
        System.out.println(empDao.selectAll().get(0).getEmpNo());
        return empDao.selectAll();
    }
}
