package com.zxy.config;

import com.zxy.interceptor.UserIntercept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptConfig implements WebMvcConfigurer {

    @Autowired
    private UserIntercept userIntercept;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userIntercept).addPathPatterns("/*");
    }
}
