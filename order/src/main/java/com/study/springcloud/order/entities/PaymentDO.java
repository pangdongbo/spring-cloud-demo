/******************************************************************************
 * 学无止境
 *****************************************************************************/

package com.study.springcloud.order.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 冰飞江南
 * @Title:
 * @history 2020年12月12日 冰飞江南 新建
 * @since JDK1.8
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDO implements Serializable {

    /**
     * 主键
     */
    private long id;

    /**
     * 付款金额
     */
    private int payMoney;

    /**
     * 付款时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date payTime;

    /**
     * 备注
     */
    private String remark;

}
