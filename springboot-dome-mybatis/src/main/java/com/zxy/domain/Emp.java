package com.zxy.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Emp implements Serializable {
    private Integer empNo;
    private String eName;
    private String job;
    private Integer mgr;
    private Date hireDate;
    private Integer sal;
    private Integer comm;
    private Integer deptNo;
}
