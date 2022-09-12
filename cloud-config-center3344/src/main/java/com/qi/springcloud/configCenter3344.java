package com.qi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 2021229100@tju.edu.cn
 * @date 2022/9/11 19:58
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class configCenter3344 {
    public static void main(String[] args) {
        SpringApplication.run(configCenter3344.class, args);
    }

}
