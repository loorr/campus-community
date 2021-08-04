package com.example.springbootstudy.model;

import lombok.Data;

/**
 * @author zjianfa
 */
@Data
public class Group {
    private Long groupId;
    private Long leaderId;
    private String groupName;
    private int maxNum = 500;
    private int currNum = 0;
}
