package com.zxy;

import com.zxy.config.JasyptConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(JasyptConfig.class)
public class JasyptApplication {
    public static void main(String[] args) {
        SpringApplication.run(JasyptApplication.class,args);
    }
}
