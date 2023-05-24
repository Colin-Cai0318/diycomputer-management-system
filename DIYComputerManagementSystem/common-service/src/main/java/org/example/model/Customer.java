package org.example.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Customer implements Serializable {
    private Integer id;             // 客户ID
    private String name;        // 姓名
    private String email;       // 邮箱
    private String phone;       // 手机号
    private String address;     // 地址
    private BigDecimal consumption;  //消费总额
    // getters and setters
    // ...

}