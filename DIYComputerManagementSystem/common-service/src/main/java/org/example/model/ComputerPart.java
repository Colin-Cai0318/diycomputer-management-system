package org.example.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;


@Data
public class ComputerPart implements Serializable {
    private Integer id;                 // 计算机配件ID
    private String name;            // 配件名称
    private String categoryName;    // 配件分类名称
    private String model;           // 配件型号
    private BigDecimal price;       // 单价
    private Integer inventory;          // 库存数量
    // 新增状态属性，用于表示配件状态
    private Integer onSaleCount;  // 在售数量 ，数量为0表示下架，但是库存不一定为0

    // getters and setters
    // ...

}