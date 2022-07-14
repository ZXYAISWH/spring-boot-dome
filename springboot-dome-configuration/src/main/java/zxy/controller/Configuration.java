package zxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zxy.config.Config;
import zxy.domain.User;

@RestController
public class Configuration {
//    @Value("${user.names}")
//    private String names;
//
//    @Value("${user.age}")
//    private String age;

    @Autowired
    private Config config;


    @RequestMapping("/hello")
    public User helloWorld(String name){
        User user = new User();
        user.setName(config.getName());
        user.setAge(config.getAge());
        return user;
    }
}
