package com.zxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.zxy.dao"})
public class TkMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkMapperApplication.class, args);
    }

}
