package org.example.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class CustomerOrder implements Serializable {
    private Integer id;                         // 订单ID
    private Integer customerId;                 // 客户ID

    private Integer partId;   //  配件ID;
    private LocalDateTime orderDate;        // 下单时间

    private Integer turnover;      //数量
    private BigDecimal finalPrice;  //成交价
    // 新增状态属性，用于表示订单状态
    private String status;   //订单状态  0 下单  1 支付  2成交  3 作废
    private String mqstatus;    //mq状态  0 失败  1 成功
    // getters and setters
    // ...


}