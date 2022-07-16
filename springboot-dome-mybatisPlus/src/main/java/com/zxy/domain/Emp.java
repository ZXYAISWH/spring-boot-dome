package com.zxy.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("emp")
public class Emp implements Serializable {
    @TableId(value = "empno")
    private Integer empNo;
    @TableField("ename")
    private String eName;
    @TableField("job")
    private String job;
    @TableField("mgr")
    private Integer mgr;
    @TableField("hiredate")
    private Date hireDate;
    @TableField("sal")
    private Integer sal;
    @TableField("comm")
    private Integer comm;
    @TableField("deptno")
    private Integer deptNo;
}
