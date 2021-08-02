package com.example.springbootstudy.model;

import lombok.Data;

import java.util.Date;

@Data
public class BaseModel {
    private Long id;
    private Date dbCreateTime;
    private Date dbModifyTime;
}
