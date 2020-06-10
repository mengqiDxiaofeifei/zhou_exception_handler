package com.zhou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger2Config
 *
 * @author zhouhoujun
 * @date 2020/6/10
 */
@Configuration
public class Swagger2Config {

    @Bean
    public Docket merchantStoreApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("internal-api")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/api/.*"))
                .build().apiInfo(testApiInfo());

    }

    private ApiInfo testApiInfo() {
        ApiInfo apiInfo = new ApiInfo("接口文档",
                "文档中可以查询及测试接口调用参数和结果",
                "0.1",
                "NO terms of service",
                "razorer@razorer.com",
                "The Apache License, Version 2.0",
                "www.razorer.com"
        );
        return apiInfo;
    }
}
