/******************************************************************************
 * 学无止境
 *****************************************************************************/

package com.study.springcloud.order.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 冰飞江南
 * @Title:
 * @history 2020年12月16日 冰飞江南 新建
 * @since JDK1.8
 */

@Configuration
public class RegBean {

    @Bean
    @LoadBalanced
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }

}
