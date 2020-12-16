package com.study.springcloud.order.service;

import com.study.springcloud.order.controller.HttpResult;
import com.study.springcloud.order.entities.PaymentDO;

public interface IOrderService {

    HttpResult get(String id);

    HttpResult add(PaymentDO paymentDO);

}
