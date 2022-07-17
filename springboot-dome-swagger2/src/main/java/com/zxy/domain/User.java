package com.zxy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户的信息")
public class User {
    @ApiModelProperty("对象名称")
    private String name;
    @ApiModelProperty("对象年龄")
    private Integer age;
}
