package com.qi.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 2021229100@tju.edu.cn
 * @date 2022/9/8 11:54
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced
//    赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
