package com.study.springcloud.payment.service;

import com.study.springcloud.payment.entities.PaymentDO;

public interface IPaymentService {

    /**
     * 添加一条数据
     * @param payment
     * @return
     */
    int add(PaymentDO payment);

    /**
     * 根据ID获取一条数据
     * @param id
     * @return
     */
    PaymentDO get(Long id);

}
