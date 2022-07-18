package com.zxy;

import com.zxy.util.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

@SpringBootTest
class SpingbootDomeRedisApplicationTests {

    @Test
    void contextLoads() {
        Jedis jedis = new Jedis("172.16.2.54",6379);
        String a = jedis.ping();
        System.out.println(a);
        jedis.close();
    }

    @Test
    public void testRedis(){
        new RedisUtils().set("aaa","bbb");
    }
}
