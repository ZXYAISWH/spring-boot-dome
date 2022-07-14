package zxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zxy.config.Configs;
import zxy.config.School;
import zxy.domain.User;

@RestController
public class Configuration {
//    @Value("${user.names}")
//    private String names;
//
//    @Value("${user.age}")
//    private String age;

    @Autowired
    private Configs configs;

    @Autowired
    private School school;


    @RequestMapping("/hello")
    public User helloWorld(String name){
        User user = new User();
        user.setName(configs.getName());
        user.setAge(configs.getAge());
        user.setWife(configs.getWife());
        return user;
    }


    @RequestMapping("/school")
    public zxy.domain.School schoolInfo(){
        zxy.domain.School schoolInfo = new zxy.domain.School();
        schoolInfo.setName(school.getName());
        schoolInfo.setAge(school.getAge());
        schoolInfo.setLoc(school.getLoc());
        return schoolInfo;
    }
}
