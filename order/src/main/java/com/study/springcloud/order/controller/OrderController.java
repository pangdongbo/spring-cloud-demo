/******************************************************************************
 * 学无止境
 *****************************************************************************/

package com.study.springcloud.order.controller;

import com.study.springcloud.order.entities.PaymentDO;
import com.study.springcloud.order.service.IOrderService;
import com.study.springcloud.order.service.IOrderService4Feign;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 冰飞江南
 * @Title:
 * @history 2020年12月16日 冰飞江南 新建
 * @since JDK1.8
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private IOrderService orderService;

    @Resource
    private IOrderService4Feign orderService4Feign;

    @GetMapping("/get/{id}")
    public HttpResult<PaymentDO> get(@PathVariable String id) {
        return orderService.get(id);
    }

    @PostMapping("/add")
    public HttpResult add(@RequestBody PaymentDO payment) {
        return orderService.add(payment);
    }

    @GetMapping("/feign/get/{id}")
    public HttpResult<PaymentDO> get4feign(@PathVariable String id) {
        return orderService4Feign.get(id);
    }

    @PostMapping("/feign/add")
    public HttpResult add4feign(@RequestBody PaymentDO payment) {
        return orderService4Feign.add(payment);
    }

}
