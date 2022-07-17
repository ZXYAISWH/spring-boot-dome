package com.zxy.config;

import com.zxy.filter.FilterUserOne;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;
import java.util.Collections;


@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<FilterUserOne> registration(){
        FilterRegistrationBean<FilterUserOne> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new FilterUserOne());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
