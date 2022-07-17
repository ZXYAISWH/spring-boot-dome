package com.zxy.controller;

import com.zxy.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@Api(tags = "用户相关的接口")
public class SwaggerController {
    /**
     * @ApiOperation("测试swagger") 接口的声明
     * @ApiIgnore(”“) 使这个接口不显示
     * @ApiImplicitParam(name = "user",value = "用户名") 对参数的描述
     * @param user
     * @return
     */
    @PostMapping("hello")
    @ApiImplicitParams({
//            @ApiImplicitParam(name = "name", value = "接收的名字")
            @ApiImplicitParam(name = "user", value = "接收的对象")
    })
    @ApiOperation("测试swagger")
    public String test(User user){
        return "hello";
    }
}
