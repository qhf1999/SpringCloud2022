package com.qi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 2021229100@tju.edu.cn
 * @date 2022/9/9 20:00
 */
@SpringBootApplication
@EnableFeignClients //开启openFeign功能
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }

}
