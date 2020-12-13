/******************************************************************************
 * 学无止境
 *****************************************************************************/

package com.study.springcloud.payment.controller;

import com.study.springcloud.payment.entities.PaymentDO;
import com.study.springcloud.payment.service.IPaymentService;
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

    @Resource
    private IPaymentService service;

    @GetMapping("/get/{id}")
    public HttpResult get(@PathVariable Long id) {
        return new HttpResult(1, "OK", service.get(id));
    }

    @PostMapping("/add")
    public HttpResult add(@RequestBody PaymentDO payment) {
        return new HttpResult(1, "OK", service.add(payment));
    }

}
