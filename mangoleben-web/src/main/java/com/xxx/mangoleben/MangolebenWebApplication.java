package com.xxx.mangoleben;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-08$-24$</P>
 * <P>@version 1.0</P>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MangolebenWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MangolebenWebApplication.class, args);
    }
}






