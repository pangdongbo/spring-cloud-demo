/******************************************************************************
 * 学无止境
 *****************************************************************************/

package com.study.springcloud.order.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 冰飞江南
 * @Title:
 * @history 2020年12月12日 冰飞江南 新建
 * @since JDK1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HttpResult<T> implements Serializable {

    /**
     * 处理状态
     */
    private int state;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

}
