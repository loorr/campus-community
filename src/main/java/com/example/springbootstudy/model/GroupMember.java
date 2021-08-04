package com.example.springbootstudy.model;

import lombok.Data;


/**
 * @author zjianfa
 */
@Data
public class GroupMember extends BaseModel{
    private Long groupId;
    private Long uid;
}
