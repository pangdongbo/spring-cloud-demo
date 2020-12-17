/******************************************************************************
 * 学无止境
 *****************************************************************************/

package com.study.springcloud.order.service.impl;

import com.study.springcloud.order.controller.HttpResult;
import com.study.springcloud.order.entities.PaymentDO;
import com.study.springcloud.order.service.IOrderService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 冰飞江南
 * @Title:
 * @history 2020年12月16日 冰飞江南 新建
 * @since JDK1.8
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    private RestTemplate restTemplate;

    private String url = "http://PAYMENT-SERVICE";

    @Override
    public HttpResult get(String id) {
        return restTemplate.getForObject(url + "/payment/get/" + id, HttpResult.class);
    }

    @Override
    public HttpResult add(PaymentDO payment) {
        HttpResult result = restTemplate.postForObject(url + "/payment/add", payment, HttpResult.class);
        return result;
    }

}
