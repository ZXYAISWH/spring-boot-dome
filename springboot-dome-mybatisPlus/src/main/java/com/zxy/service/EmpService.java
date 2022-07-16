package com.zxy.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zxy.dao.EmpDao;
import com.zxy.domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService{
    @Autowired
    private EmpDao empDao;


    public List<Emp> selectAll(){
        Page<Emp> page = new Page(2 ,3);
        QueryWrapper<Emp> queryWrapper = new QueryWrapper();
        queryWrapper.gt("sal",1500);
        IPage<Emp> iPage = empDao.selectPage(page,queryWrapper);
        return iPage.getRecords();
    }


    public Emp selectOne(Integer empno){
        return empDao.selectOne(empno);
    }
}
