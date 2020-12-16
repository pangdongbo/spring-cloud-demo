/******************************************************************************
 * 学无止境
 *****************************************************************************/

package com.study.springcloud.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 冰飞江南
 * @Title:
 * @history 2020年12月16日 冰飞江南 新建
 * @since JDK1.8
 */

@SpringBootApplication
@EnableEurekaServer
public class StartEuraka {

    public static void main(String args[]) {
        SpringApplication.run(StartEuraka.class, args);
    }

}
