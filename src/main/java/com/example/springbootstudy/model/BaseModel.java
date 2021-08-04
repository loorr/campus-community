package com.example.springbootstudy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author zjianfa
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseModel {
    private Long id;
    private Timestamp dbCreateTime;
    private Timestamp dbModifyTime;
}
