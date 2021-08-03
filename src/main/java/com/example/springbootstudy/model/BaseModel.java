package com.example.springbootstudy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseModel {
    private Long id;
    private Date dbCreateTime;
    private Date dbModifyTime;
}
