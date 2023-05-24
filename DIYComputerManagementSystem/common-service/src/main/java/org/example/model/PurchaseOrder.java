package org.example.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PurchaseOrder implements Serializable {
    private Integer id;                         // 订单ID
    private Integer manufacturerId;                 // 厂商ID

    private Integer partId;   //  配件ID;

    private LocalDateTime orderDate;        // 下单时间

    private Integer num;      //数量

    private BigDecimal SinglePrice;  //单价

}
