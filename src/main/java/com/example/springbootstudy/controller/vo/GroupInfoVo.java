package com.example.springbootstudy.controller.vo;

import lombok.Data;

/**
 * @author zjianfa
 */
@Data
public class GroupInfoVo {
    private Long groupId;
    private String groupName;
    private int currNum;
    private int maxNum;
    private String nickname;
}
