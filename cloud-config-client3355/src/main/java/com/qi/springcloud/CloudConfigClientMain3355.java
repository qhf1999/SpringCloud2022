package com.qi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 2021229100@tju.edu.cn
 * @date 2022/9/11 20:13
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConfigClientMain3355 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientMain3355.class, args);
    }
}
