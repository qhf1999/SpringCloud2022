package com.qi.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @author 2021229100@tju.edu.cn
 * @date 2022/9/9 20:52
 */

public interface PaymentService {
    String paymentInfo_Ok(Integer id);
    String paymentInfo_TimeOut(Integer id);
}
