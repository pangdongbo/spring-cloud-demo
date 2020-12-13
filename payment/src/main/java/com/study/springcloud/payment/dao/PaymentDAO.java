package com.study.springcloud.payment.dao;

import com.study.springcloud.payment.entities.PaymentDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDAO {

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
