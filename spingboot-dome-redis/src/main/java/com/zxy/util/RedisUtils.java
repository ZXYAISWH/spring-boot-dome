package com.zxy.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zxy.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    public void set(String key,Object value){
//        System.out.println(redisTemplate.opsForValue().get("aaa"));
//        System.out.println(redisTemplate);
        redisTemplate.opsForValue().set(key,new User("zxy","aaa"));
        redisTemplate.opsForValue().set("bbb",new User("zhangsan","333"));
        User user = (User)redisTemplate.opsForValue().get(key);
        System.out.println(user);
    }
}
