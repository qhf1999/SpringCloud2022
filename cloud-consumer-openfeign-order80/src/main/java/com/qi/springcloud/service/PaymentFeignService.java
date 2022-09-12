package com.qi.springcloud.service;

import com.qi.springcloud.entities.CommonResult;
import com.qi.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 2021229100@tju.edu.cn
 * @date 2022/9/9 20:16
 */

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")   //对应服务提供者的方法
//接口中定义的每个方法都与服务提供者（即 cloud-payment-service8001 等）中 Controller 定义的服务方法对应。
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();


}
