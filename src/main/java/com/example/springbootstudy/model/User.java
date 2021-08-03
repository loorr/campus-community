package com.example.springbootstudy.model;

import lombok.Data;

@Data
public class User extends BaseModel{

    private Long uid;
    private String nickname;
    private String email;
    private Long phone;
    private String password;
    private boolean isAdmin;

}
