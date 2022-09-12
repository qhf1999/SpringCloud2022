package com.qi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 2021229100@tju.edu.cn
 * @date 2022/9/9 16:20
 */
@SpringBootApplication
@EnableEurekaServer //开启 Eureka server,接受其他微服务的注册
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
