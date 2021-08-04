package com.example.springbootstudy.model;

import lombok.Data;

/**
 * @author zjianfa
 */
@Data
public class Friends extends BaseModel{

    private Long toUid;
    private Long fromUid;

}
