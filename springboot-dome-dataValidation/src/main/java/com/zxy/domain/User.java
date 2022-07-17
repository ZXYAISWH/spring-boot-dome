package com.zxy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotBlank(message = "名字不能为空")
    private String username;

    @NotNull(message = "{user.age}")
    private Integer age;
}
