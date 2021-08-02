package com.example.springbootstudy.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private Date dbCreateTime;
    private Date dbModifyTime;
    private Long uid;
    private String nickname;
    private String email;
    private Long phone;
    private String password;
    private boolean isAdmin;

}
