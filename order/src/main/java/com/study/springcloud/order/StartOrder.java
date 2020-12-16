/******************************************************************************
 * 学无止境
 *****************************************************************************/

package com.study.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 冰飞江南
 * @Title:
 * @history 2020年12月16日 冰飞江南 新建
 * @since JDK1.8
 */
@SpringBootApplication
@EnableEurekaClient
public class StartOrder {

    public static void main(String args[]) {
        SpringApplication.run(StartOrder.class, args);
    }

}
