package com.study.springcloud.order.service;

import com.study.springcloud.order.controller.HttpResult;
import com.study.springcloud.order.entities.PaymentDO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@FeignClient(value = "PAYMENT-SERVICE")
public interface IOrderService4Feign {

    @GetMapping("/payment/get/{id}")
    HttpResult<PaymentDO> get(@PathVariable("id") String id);

    @PostMapping("/payment/add")
    HttpResult add(@RequestBody PaymentDO payment);

}
