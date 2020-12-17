/******************************************************************************
 * 学无止境
 *****************************************************************************/

package com.study.springcloud.hystrix.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 冰飞江南
 * @Title: 熔断示例：服务端
 * @history 2020年12月17日 冰飞江南 新建
 * @since JDK1.8
 */
@SpringBootApplication
public class StartHystrixService {

    public static void main(String args[]) {
        SpringApplication.run(StartHystrixService.class, args);
    }

}
