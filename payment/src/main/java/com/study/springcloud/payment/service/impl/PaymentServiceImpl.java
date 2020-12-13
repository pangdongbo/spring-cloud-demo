/******************************************************************************
 * 学无止境
 *****************************************************************************/

package com.study.springcloud.payment.service.impl;

import com.study.springcloud.payment.dao.PaymentDAO;
import com.study.springcloud.payment.entities.PaymentDO;
import com.study.springcloud.payment.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.JDBCType;

/**
 * @author 冰飞江南
 * @Title:
 * @history 2020年12月12日 冰飞江南 新建
 * @since JDK1.8
 */

@Service
public class PaymentServiceImpl implements IPaymentService {

    @Resource
    private PaymentDAO payDao;

    @Override
    public int add(PaymentDO payment) {
        return payDao.add(payment);
    }

    @Override
    public PaymentDO get(Long id) {
        return payDao.get(id);
    }
}
