package com.zxy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zxy.domain.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmpDao extends BaseMapper<Emp>{
    @Select("select * from emp where empno = #{empno}")
    public Emp selectOne(@Param("empno")Integer empno);
}
