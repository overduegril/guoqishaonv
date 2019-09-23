package com.xxx.mangoleben;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-08$-23$</P>
 * <P>@version 1.0</P>
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.xxx.mangoleben.mapper")
public class ClassicApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClassicApplication.class, args);
    }
}
