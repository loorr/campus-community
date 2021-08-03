package com.example.springbootstudy.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author zjianfa
 */
@Data
public class BaseModel {
    private Long id;
    private Timestamp dbCreateTime;
    private Timestamp dbModifyTime;
}
