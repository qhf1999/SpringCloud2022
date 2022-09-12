package com.qi.springcloud.controller;

import com.qi.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 2021229100@tju.edu.cn
 * @date 2022/9/9 20:56
 */
@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     * 正常访问
     *
     * @param id
     * @return
     */
    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfoOK(@PathVariable("id") Integer id) {
        String result = paymentService.paymentInfo_Ok(id);
        log.info("result: " + result);
        return result;
    }


    /**
     * 超时或者异常
     *
     * @param id
     * @return
     */
    @GetMapping("/hystrix/timeout/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id) {
        String result = paymentService.paymentInfo_TimeOut(id);
        log.info("result: " + result);
        return result;
    }


    /**
     * 服务熔断
     *
     * @param id
     * @return
     */
//    @GetMapping("/circuit/{id}")
//    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
//        String result = paymentService.paymentCircuitBreaker(id);
//        log.info("****result: " + result);
//        return result;
//    }
}
