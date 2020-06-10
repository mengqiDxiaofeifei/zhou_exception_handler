package com.zhou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ZhouApplication
 *
 * @author zhouhoujun
 * @date 2020/6/10
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan("com.zhou.**.dao")
public class ZhouApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhouApplication.class, args);
    }

}
