/******************************************************************************
 * 学无止境
 *****************************************************************************/

package com.study.springcloud.hystrix.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author 冰飞江南
 * @Title:
 * @history 2020年12月17日 冰飞江南 新建
 * @since JDK1.8
 */

@RestController
@RequestMapping("/hystrix/service")
public class HystrixServiceController {

    @GetMapping("/ok")
    public String ok() {
        return "Thread name：" + Thread.currentThread().getName() + "，action：ok";
    }

    @GetMapping("/slow")
    public String slow() {
        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return "Thread name：" + Thread.currentThread().getName() + "，action：slow";
    }

    @GetMapping("/error")
    public String error() {
        int result = 10 / 0;
        return "Thread name：" + Thread.currentThread().getName() + "，action：error";
    }

}
