package org.example.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Administrator implements Serializable {


    private Integer id;       // 管理员 ID
    private String username;  // 管理员用户名
    private String password;  // 管理员密码
    private String email;     // 管理员邮箱
    private String privilegeCode; // 管理员权限码，可以为空
}
