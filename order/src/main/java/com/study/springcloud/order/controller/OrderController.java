/******************************************************************************
 * 学无止境
 *****************************************************************************/

package com.study.springcloud.order.controller;

import com.study.springcloud.order.entities.PaymentDO;
import com.study.springcloud.order.service.IOrderService;
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

    @GetMapping("/get/{id}")
    public HttpResult<PaymentDO> get(@PathVariable String id) {
        return new HttpResult(1, "ok", orderService.get(id));
    }

    @PostMapping("/add")
    public HttpResult add(@RequestBody PaymentDO payment) {
        return orderService.add(payment);
    }

}
