/******************************************************************************
 * 学无止境
 *****************************************************************************/

package com.study.springcloud.payment.controller;

import com.study.springcloud.payment.entities.PaymentDO;
import com.study.springcloud.payment.service.IPaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 冰飞江南
 * @Title:
 * @history 2020年12月12日 冰飞江南 新建
 * @since JDK1.8
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private IPaymentService service;

    @GetMapping("/get/{id}")
    public HttpResult get(@PathVariable Long id) {
        PaymentDO payment = service.get(id);
        payment.setRemark(serverPort);
        return new HttpResult(1, "OK " + serverPort, payment);
    }

    @PostMapping("/add")
    public HttpResult add(@RequestBody PaymentDO payment) {
        return new HttpResult(1, "OK", service.add(payment));
    }

}
