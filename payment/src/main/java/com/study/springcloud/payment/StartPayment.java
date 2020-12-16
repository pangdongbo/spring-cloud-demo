/******************************************************************************
 * Copyright (C) 2017 ShenZhen Powerdata Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳博安达开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/

package com.study.springcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 冰飞江南
 * @Title:
 * @history 2020年12月12日 冰飞江南 新建
 * @since JDK1.8
 */
@SpringBootApplication
@EnableEurekaClient
public class StartPayment {

    public static void main(String args[]) {
        SpringApplication.run(StartPayment.class, args);
    }

}
