package com.zxy.conroller;

import com.zxy.domain.User;
import com.zxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/selectAllUser")
    @ResponseBody
    public List<User> selectAll(){
        return userService.selectAll();
    }
}
