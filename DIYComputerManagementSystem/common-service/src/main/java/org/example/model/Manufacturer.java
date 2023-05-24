package org.example.model;

import lombok.Data;

import java.io.Serializable;


@Data
public class Manufacturer implements Serializable {
    private String name;        // 厂商名称
    private String address;     // 厂商地址
    private String phone;       // 厂商电话
    private String description; // 厂商描述

}
