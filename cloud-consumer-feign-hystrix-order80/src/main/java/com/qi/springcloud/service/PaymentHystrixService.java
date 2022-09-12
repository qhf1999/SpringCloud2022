package com.qi.springcloud.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 2021229100@tju.edu.cn
 * @date 2022/9/9 22:03
 */
public interface PaymentHystrixService {
    @GetMapping("/hystrix/ok/{id}")
    String paymentInfoOK(Integer id);

    @GetMapping("/hystrix/timeout/{id}")
    String paymentInfoTimeOut(Integer id);
}
