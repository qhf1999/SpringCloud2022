package com.qi.springcloud.service.Impl;

import com.qi.springcloud.entities.Payment;
import com.qi.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Service;

/**
 * @author 2021229100@tju.edu.cn
 * @date 2022/9/9 22:03
 */
@Service
public class PaymentHystrixServiceImp implements PaymentHystrixService {
    @Override
    public String paymentInfoOK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
