package com.zxy.dao;

import com.zxy.domain.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface EmpDao {

    @Select("select * from emp")
    public List<Emp> selectAll();
}
