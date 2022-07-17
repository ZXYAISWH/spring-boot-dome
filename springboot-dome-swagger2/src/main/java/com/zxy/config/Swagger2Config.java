package com.zxy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    /**
     * RequestHandlerSelectors.any()获取所有的接口
     * @return
     */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).
                select().
                apis(RequestHandlerSelectors.basePackage("com.zxy.controller")).
                paths(PathSelectors.any()).
                build().apiInfo(apiInfo());
    }

    /**
     * 自定义文档介绍
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("这只是一个demo").description("swagger2").version("2.9.2").build();
    }
}
